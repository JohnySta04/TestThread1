package com.brainacad.oop.testthread1;

class MyTimeBomb1 extends Thread {

    public void run() {

        for (int i = 10; i > 0; i--) {

            System.out.println("2.17.1 " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("2.17.1 Boom!!!");
    }
}

class MyTimeBomb2 implements Runnable {

    @Override
    public void run() {

        for (int i = 10; i > 0; i--) {

            System.out.println("2.17.2 " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("2.17.2 Boom!!!");
    }
}
