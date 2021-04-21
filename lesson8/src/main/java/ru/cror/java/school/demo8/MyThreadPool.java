package ru.cror.java.school.demo8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThreadPool {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

//        List<Future<?>> futures = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            futures.add(executorService.submit(new MyTask("Задача " + i)));
//        }
//        executorService.shutdown();
//
//        while (count(futures) != 0) {
//            Thread.sleep(100);
//            System.out.println(count(futures));
//        }


        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            futures.add(executorService.submit(new MyTaskWithResult("Задача " + i)));
        }
        executorService.shutdown();

        while (countFutureStr(futures) != 0) {
            Thread.sleep(100);
            System.out.println(countFutureStr(futures));
        }

        for (Future<?> future : futures) {
            System.out.println(future.get());
        }
    }

    private static int count(List<Future<?>> futures) {
        int count = 0;
        for (Future<?> future : futures) {
            if (!future.isDone()) {
                count++;
            }
        }
        return count;
    }
    private static int countFutureStr(List<Future<String>> futures) {
        int count = 0;
        for (Future<?> future : futures) {
            if (!future.isDone()) {
                count++;
            }
        }
        return count;
    }
}
