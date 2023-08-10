package Polimorfismo;

public class Venado extends Animal implements Herbivoro,Mamifero{
    @Override
    public void Comer() {
        System.out.println("Venado comiendo");
    }

    @Override
    public void reproducir() {

    }

    @Override
    public void amamantar() {

    }
}
