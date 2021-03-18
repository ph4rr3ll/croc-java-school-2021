package ru.croc.java.demo4.user;

import ru.croc.java.demo4.cache.Cache;
import ru.croc.java.demo4.cache.CacheKey;

/**
 * Пользователь.
 */
public class User implements CacheKey {
    /** Имя учетной записи. */
    private final String login;
    /** Имя. */
    private final String name;

    /**
     * Пользователь.
     *
     * @param login имя учетной записи
     * @param name имя
     */
    public User(String login, String name) {
        this.login = login;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getKey() {
        return login;
    }
}
