package org.example;

public class Figura {
    private final double altura;
    private final double base;

    public Figura(double altura,double base){
        this.base=base;
        this.altura=altura;
    }

    public double getAltura(){
        return altura;
    }

    public double getBase(){
        return base;
    }

    void MostrarDimension(){
        System.out.println("La base y altura es: " + base + " y " + altura);
    }

}
