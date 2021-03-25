package ru.croc.java.demo4.task;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитывает количество вхождений слов в текст.
 */
public class TextCounter {

    /**
     * Подсчитывает статистику вхождения слов в текст.
     *
     * @param text текс
     * @return статисктика
     */
    public Map<String, Integer> count(String text) {
        final Map<String, Integer> statistic = new HashMap<>();
        final String[] words = text.replace(".", " ")
                .replace(",", " ")
                .replaceAll("\\s+", " ")
                .toLowerCase()
                .trim()
                .split(" ");
        for (String word : words) {
            if (!statistic.containsKey(word)) {
                statistic.put(word, 0);
            }
            statistic.put(word, statistic.get(word) + 1);
        }
        return statistic;
    }
}
