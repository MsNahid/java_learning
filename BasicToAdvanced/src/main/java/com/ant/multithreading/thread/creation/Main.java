package com.ant.multithreading.thread.creation;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are in run method: " + Thread.currentThread().getName());
                System.out.println("Current thread: " + Thread.currentThread().getPriority());

            }
        });

        thread.setName("New Worker Thread");

        thread.setPriority(Thread.MAX_PRIORITY);



        Thread.sleep(1000);

        System.out.println("We are in thread " + Thread.currentThread().getName() + " before starting new thread.");



        thread.start();

        System.out.println("We are in thread " + Thread.currentThread().getName() + " after starting new thread.");

        Thread thread1 = new NewThread();

        thread1.start();


    }

    public static class NewThread extends Thread{

        @Override
        public void run(){

            System.out.println("New Thread name: " + this.getName());

        }
    }
}
