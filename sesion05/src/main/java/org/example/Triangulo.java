package org.example;

public class Triangulo extends Figura {
    private final String estilo;

    public Triangulo(double altura, double base, String estilo) {
        super(altura, base);
        this.estilo = estilo;
    }

    public double area() {
        return getBase() * getAltura() / 2;
    }

    public void mostrarEstilo() {
        System.out.println("Triangulo es: " + estilo);

    }

}
