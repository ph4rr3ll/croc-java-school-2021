package ru.croc.java.demo4.document;

import ru.croc.java.demo4.cache.CacheKey;

/**
 * Документа.
 */
public class Document implements CacheKey {
    /** Ид. */
    private final String id;
    /** текст. */
    private final String text;

    public Document(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    @Override
    public String getKey() {
        return id;
    }
}
