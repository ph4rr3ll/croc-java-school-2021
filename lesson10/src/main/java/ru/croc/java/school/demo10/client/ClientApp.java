package ru.croc.java.school.demo10.client;

import java.io.*;
import java.net.Socket;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Клиентское приложение.
 */
public class ClientApp {

    public static void main(String[] args) throws IOException {
        final Socket socket = new Socket("localhost", 8080);
        final BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Имя пользователя...\n");
        output.write(scanner.nextLine());
        output.newLine();
        output.flush();

        final BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        new Thread(() -> {
            while (socket.isConnected()) {
                try {
                    final String message = input.readLine();
                    System.out.println(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        while (true) {
            output.write(scanner.nextLine());
            output.newLine();
            output.flush();
        }
    }
}
