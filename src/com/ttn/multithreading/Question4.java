package com.ttn.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        });



        executorService.submit(new Runnable() {
            @Override
            public void run() {
                if (executorService.isShutdown()) {
                    System.out.println("Shutdown Successfully.");
                }
            }
        });
        System.out.println(executorService.shutdownNow());

        System.out.println("Main Thread Executed Successfully.");

        executorService.shutdown();
    }
}