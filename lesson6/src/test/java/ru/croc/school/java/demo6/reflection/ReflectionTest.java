package ru.croc.school.java.demo6.reflection;

import org.junit.jupiter.api.Test;
import ru.croc.school.java.demo6.databind.reflection.F;
import ru.croc.school.java.demo6.databind.reflection.PrivateMethodInvoke;

import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

    @Test
    public void testInvokePrivateMethod() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        final PrivateMethodInvoke privateMethodInvoke = new PrivateMethodInvoke();
        privateMethodInvoke.invoke(new F(), "methodF", "Nothing");
    }
}
