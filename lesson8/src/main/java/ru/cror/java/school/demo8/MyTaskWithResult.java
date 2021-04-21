package ru.cror.java.school.demo8;

import java.util.concurrent.Callable;

public class MyTaskWithResult implements Callable<String> {
    private String name;

    public MyTaskWithResult(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Выполняем .... " + name);
        return name + " - Готов!";
    }
}
