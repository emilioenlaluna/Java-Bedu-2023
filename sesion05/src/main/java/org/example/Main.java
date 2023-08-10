package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Started...");
        MiembrosEstaticos miembrosEstaticos=new MiembrosEstaticos();
        System.out.println("Contador de instancias de clase"+miembrosEstaticos.getContadorInstancia());
        System.out.println("Contador de clase"+miembrosEstaticos.getContadorClase());

        MiembrosEstaticos miembrosEstaticos2=new MiembrosEstaticos();
        System.out.println("Contador de instancias de clase"+miembrosEstaticos2.getContadorInstancia());
        System.out.println("Contador de clase"+miembrosEstaticos2.getContadorClase());

        MiembrosEstaticos miembrosEstaticos3=new MiembrosEstaticos();
        System.out.println("Contador de instancias de clase"+miembrosEstaticos3.getContadorInstancia());
        System.out.println("Contador de clase"+miembrosEstaticos3.getContadorClase());


    }
}