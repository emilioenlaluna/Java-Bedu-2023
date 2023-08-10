package org.example;

import Polimorfismo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Venado venado=new Venado();
        venado.setNombre("Bambi");

        venado.amamantar();
    }
}