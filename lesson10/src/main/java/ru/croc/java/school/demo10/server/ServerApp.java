package ru.croc.java.school.demo10.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Серверное приложение.
 */
public class ServerApp {

    public static void main(String[] args) throws IOException {
        final ServerSocket serverSocket = new ServerSocket(8080);
        final Chat chat = new Chat();

        while (true) {
            // слушаем порт и принимаем соедниение
            final Socket socket = serverSocket.accept();
            // создаем объект для работы с соединением
            final Client client = new Client(socket, chat);
            System.out.println("Подключился - " + client.name());
            // сохраняем в общий список
            chat.add(client);
        }
    }
}
