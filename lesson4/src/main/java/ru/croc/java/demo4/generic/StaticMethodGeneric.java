package ru.croc.java.demo4.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Пример generic на статических методах.
 */
public class StaticMethodGeneric {

    /**
     * generic метод.
     *
     * @param param1
     * @param <T> тип параметра
     * @return результат
     */
    static <T, E> T example(T param1, T param2, E param3) {
        // Ограничения:
        // new T();
        // new T[] {};
        return null;
    }

    static <String> String f(String s) {
        // return ""; ошибка
        return s;
    }
}
