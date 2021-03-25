package ru.croc.java.demo4.cache;

/**
 * Ключ к объету в кэше.
 */
public interface CacheKey {
    /**
     * Возвращает ключ к объекту.
     *
     * @return ключ
     */
    String getKey();
}
