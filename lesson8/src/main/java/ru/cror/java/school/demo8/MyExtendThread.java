package ru.cror.java.school.demo8;

public class MyExtendThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Поток 2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
