package ru.croc.java.demo4.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.croc.java.demo4.cache.Cache;
import ru.croc.java.demo4.user.User;
import ru.croc.java.demo4.user.UserCache;

/**
 * Тесты для кэша объектов "пользователь".
 */
public class UserCacheTest {

    /**
     * Проверяем добавление и получения пользователя из кэша.
     */
    @Test
    public void testPutAndGet() {
        User sasha = new User("sasha", "Саша");

        final UserCache cache = new UserCache();
        cache.put(sasha);
        Assertions.assertEquals(sasha, cache.get("sasha"));
    }

    /**
     * Проверяем добавление и получения пользователя из {@link Cache}.
     */
    @Test
    public void testPutAndGetForCache() {
        User sasha = new User("sasha", "Саша");

        final Cache<User> cache = new Cache<>();
        cache.put(sasha);
        Assertions.assertEquals(sasha, cache.get("sasha"));
    }
}
