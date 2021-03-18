package ru.croc.java.demo4.user;

import java.util.HashMap;
import java.util.Map;

/**
 * Кэш для пользователей.
 */
public class UserCache {
    /** Хранилище данных с пользователями. */
    private Map<String, User> cache = new HashMap<>();

    /**
     * Добавляем пользователя.
     *
     * @param user пользователь
     */
    public void put(User user) {
        cache.put(user.getLogin(), user);
    }

    /**
     * Возвращает пользователя, если он есть в кэше.
     *
     * @param login имя учетной записи
     * @return пользователь, если нет, то null
     */
    public User get(String login) {
        return cache.get(login);
    }
}
