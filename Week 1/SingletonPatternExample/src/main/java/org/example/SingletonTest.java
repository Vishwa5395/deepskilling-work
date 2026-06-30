package org.example;

public class SingletonTest {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Hello");
        logger2.log("Welcome");

        System.out.println(logger1);
        System.out.println(logger2);

        if (logger1 == logger2)
            System.out.println("Same Object");
        else
            System.out.println("Different Objects");
    }
}
