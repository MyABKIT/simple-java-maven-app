package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
	System.out.println(" modified");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
