package com.brainacad.oop.testthread1;

public class Main {

    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.17.1 ");
        System.out.println("--------------------------------------------");

        MyTimeBomb1 bomb1 = new MyTimeBomb1();
        bomb1.start();
        System.out.println("******************************************");
        System.out.println("Labwork 2.17.2 ");
        System.out.println("--------------------------------------------");

        MyTimeBomb2 bomb2 = new MyTimeBomb2();
        Thread thread = new Thread(bomb2);
        thread.start();
        System.out.println("******************************************");
    }
}
