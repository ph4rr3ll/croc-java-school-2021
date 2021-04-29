package ru.croc.java.school.demo10.server;

import java.util.HashMap;
import java.util.Map;

/**
 * Сервис рассылки сообщений.
 */
public class Chat {
    private final Map<String, Client> clients = new HashMap<>();

    /**
     * Добавляет пользователя в чат.
     *
     * @param client
     */
    public void add(Client client) {
        clients.put(client.name(), client);
    }

    /**
     * Отправка сообщения в чат.
     *
     * @param author автор
     * @param message сообщение
     */
    public void sendMessage(String author, String message) {
        final String msgWithAuthor = String.format("%s> %s", author, message);
        clients.entrySet().stream()
                .filter(entry -> !entry.getKey().equals(author))
                .forEach(entry -> entry.getValue().send(msgWithAuthor));
    }


}
