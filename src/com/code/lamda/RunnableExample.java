package com.code.lamda;

public class RunnableExample {

    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed in Runnable");
            }
        });
        myThread.start();

        Thread myLamdaThread = new Thread(() -> System.out.println("Printed in Lamda Runnable"));
        myLamdaThread.start();
    }
}
