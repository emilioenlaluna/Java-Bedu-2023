package org.example;

public class PreworkObject {
    public static int var=inicializaCampo();

    static {
        var=10;
    }
    //Los bloques de inicialización se pueden sustituir por métodos estáticos:

    private static int inicializaCampo(){
        return 10;
    }

}
