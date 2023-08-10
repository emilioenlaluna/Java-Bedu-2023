package org.example;

public class MiembrosEstaticos {
    private short contadorClase;
    private static short contadorInstancia;

    public short getContadorClase() {
        return this.contadorClase;
    }

    public static short getContadorInstancia() {
        return contadorInstancia;
    }

    public MiembrosEstaticos(){
        contadorClase++;
        contadorInstancia++;
    }
}
