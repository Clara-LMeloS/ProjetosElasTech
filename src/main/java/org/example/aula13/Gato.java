package org.example.aula13;

public class Gato implements Animal {
    @Override
    public String emitirSom() {
        return "Auau";
    }
    @Override
    public String miar() {
        System.out.println("Meow!");
        return "Miau";
    }
}
