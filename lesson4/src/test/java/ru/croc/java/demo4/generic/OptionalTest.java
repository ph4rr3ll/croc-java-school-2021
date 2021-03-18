package ru.croc.java.demo4.generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Проверка {@link Optional}.
 */
public class OptionalTest {

    /**
     * Проверка обертки, когда значение не null.
     */
    @Test
    public void testOptionalFromValue() {
        final Optional<String> value = Optional.of("Строка");
        Assertions.assertTrue(value.isPresent());
        Assertions.assertEquals("Строка", value.get());
    }

    /**
     * Проверка обертки, когда значение null.
     */
    @Test
    public void testOptionalFromNull() {
        final Optional<String> value = Optional.of(null);
        // Optional.of((String) null); типизированный null
        Assertions.assertFalse(value.isPresent());
        Assertions.assertNull(value.get());
    }
}
