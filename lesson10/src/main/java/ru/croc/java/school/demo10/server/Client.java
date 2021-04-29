package ru.croc.java.school.demo10.server;

import java.io.*;
import java.net.Socket;

/**
 * Представляет соединение с клиентом.
 */
public class Client {
    private final Socket socket;
    private final BufferedWriter output;
    private final BufferedReader input;
    private final String name;
    private final Chat chat;

    public Client(Socket socket, Chat chat) throws IOException {
        this.socket = socket;
        this.chat = chat;
        output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        name = input.readLine();
        // Новый поток чтения сообщений от клиента
        new Thread(() -> {
            while (socket.isConnected()) {
                try {
                    final String message = input.readLine();
                    chat.sendMessage(name, message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * Отправляет сообщение на клиент.
     *
     * @param message сообщение
     */
    public void send(String message) {
        try {
            output.write(message);
            output.newLine();
            output.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Имя клиента.
     *
     * @return имя
     */
    public String name() {
        return name;
    }
}
