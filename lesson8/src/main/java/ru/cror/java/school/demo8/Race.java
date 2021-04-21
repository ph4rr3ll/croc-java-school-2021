package ru.cror.java.school.demo8;

public class Race {

    static boolean flag = false;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!flag) {
                    System.out.println("Ждем!");
                }
                System.out.println("Готово!");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = true;
                System.out.println("Установил!");
            }
        }).start();
    }
}
