
//package com.ttn.multithreading;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question15 {

        Lock lock = new ReentrantLock(true);

        //  Conditions are used in order for a thread to be notified, when a condition is true.
        Condition condition = lock.newCondition();

        public void consumer() {
            try {
//          acquiring a lock on current thread
                lock.lock();
                System.out.println("consumer Started");

                condition.await();
                System.out.println("consumer Finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
//          releasing the lock.
                lock.unlock();
            }

        }

        public void producer() {
            try {
                lock.lock();
                System.out.println("producer Started");
                System.out.println("producer Finished");
//          Wakes up one waiting thread.If any threads are waiting on this condition then one is selected for waking
//          up. That thread must then re-acquire the lock before returning from await.
                condition.signal();

//          Wakes up all waiting threads.If any threads are waiting on this condition then they are all woken up.
                condition.signalAll();

            } finally {
                lock.unlock();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Question15 q15 = new Question15();
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    q15.consumer();
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    q15.producer();
                }
            });
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        }
    }

