package ru.croc.school.java.demo6.databind.reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethodInvoke {

    /**
     * Вызывает приватный метод.
     *
     * @param obj объект с методом
     * @param methodName название метода
     * @param parameter параметр
     */
    public void invoke(Object obj, String methodName, String parameter) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = obj.getClass().getDeclaredMethod(methodName, String.class);
        method.setAccessible(true);
        method.invoke(obj, parameter);
    }
}
