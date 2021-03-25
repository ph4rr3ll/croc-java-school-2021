package ru.croc.java.demo4.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Посчитать количество вхождений каждого слова в текст.
 */
public class Task1Test {

    @Test
    public void test() {
        final String text = "aa bb c error. And and aa c, 78.";
        TextCounter textCounter = new TextCounter();
        Assertions.assertNotNull(textCounter.count(text));
        Assertions.assertEquals(2, textCounter.count(text).get("aa"));
        Assertions.assertEquals(2, textCounter.count(text).get("c"));
        Assertions.assertEquals(2, textCounter.count(text).get("and"));
        Assertions.assertEquals(1, textCounter.count(text).get("78"));
        Assertions.assertNull(textCounter.count(text).get("f"));

        System.out.println(textCounter.count(text));
    }

}
