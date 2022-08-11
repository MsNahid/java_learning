package com.ant.lambda;

public class RunnableExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;

                for(int i = 0; i < 10; i++){
                    sum += i;
                }
                System.out.println("Traditional way sum: " + sum);
            }
        };

        new Thread(runnable).start();

        // lambda way
        Runnable runnable1 = () ->{
            int sum = 0;

            for(int i = 0; i < 10; i++){
                sum += i;
            }

            System.out.println("Lambda way sum: " + sum);
        };

        new Thread(runnable1).start();

        // Inline lambda way
        new Thread(() -> {
            int sum = 0;
            for(int i = 0; i < 10; i++){
                sum += i;
            }
            System.out.println("Lambda inline: " + sum);
        }).start();
    }
}
