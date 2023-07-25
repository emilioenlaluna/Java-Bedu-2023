package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program has started");
        Usuario objetoUsuario =new Usuario();
        objetoUsuario.setNombre("Emilio");
        System.out.println(objetoUsuario.getNombre());
    }
}