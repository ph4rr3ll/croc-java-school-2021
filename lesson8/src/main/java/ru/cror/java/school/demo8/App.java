package ru.cror.java.school.demo8;

public class App {

    public static void main(String[] args) throws InterruptedException {
        final MyExtendThread thread = new MyExtendThread();
        thread.setDaemon(true);
        thread.start();
        thread.join();

        final Thread threadRunnable = new Thread(new MyRunnable());
        threadRunnable.start();
    }
}
