package ru.croc.javaschool.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BombClassTest {

    private BombClass bombClass = new BombClass();

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(
                RuntimeException.class,
                () -> bombClass.divideByZero(1));

        Assertions.assertThrows(
                ArithmeticException.class,
                () -> bombClass.divideByZero(1));
    }

    @Test
    public void testGetSeason() throws Exception {
        Assertions.assertEquals("Winter", bombClass.getSeason(12));

        Assertions.assertThrows(
                Exception.class,
                () -> bombClass.getSeason(13));

        try {
            Assertions.assertEquals("Winter", bombClass.getSeason(0));
        } catch (Exception e) {
            System.out.println("Exception was thrown");
        }
    }
}


















