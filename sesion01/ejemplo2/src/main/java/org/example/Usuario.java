package org.example;

public class Usuario {
    private String Nombre;
    private String Apellido;
    private String NumeroTelefonico;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNumeroTelefonico() {
        return NumeroTelefonico;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        NumeroTelefonico = numeroTelefonico;
    }
}
