package ru.croc.java.demo4.document;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.croc.java.demo4.cache.Cache;
import ru.croc.java.demo4.user.User;
import ru.croc.java.demo4.user.UserCache;

/**
 * Тест кэша для докуметов.
 */
public class DocumentCacheTest {

    /**
     * Проверяем добавление и получения пользователя из кэша.
     */
    @Test
    public void testPutAndGet() {
        Document document = new Document("5", "Текст!");

        final Cache<Document> cache = new Cache<>();
        cache.put(document);
        Assertions.assertEquals(document, cache.get("5"));
    }
}
