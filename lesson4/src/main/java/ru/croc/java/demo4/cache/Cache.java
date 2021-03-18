package ru.croc.java.demo4.cache;

import ru.croc.java.demo4.user.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Кэш для любых типов объектов.
 * @param <Type> тип
 */
public class Cache<Type extends CacheKey> {
    /** Хранилище данных. */
    private Map<String, Type> cache = new HashMap<>();

    /**
     * Добавляем обхъект.
     *
     * @param value объект
     */
    public void put(Type value) {
        cache.put(value.getKey(), value);
    }

    /**
     * Возвращает объект, если он есть в кэше.
     *
     * @param key ключ
     * @return объект, если нет, то null
     */
    public Type get(String key) {
        return cache.get(key);
    }
}
