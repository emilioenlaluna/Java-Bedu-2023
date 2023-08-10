package org.example;

import java.io.Console;

public class Consola {
    public static void main(String[] args) {
        Console consola= System.console();
        if(consola==null){
            System.err.println("No console");
            System.exit(1);
        }
        String consoleInput=consola.readLine();
        System.out.println(consoleInput);
    }
}
