package org.example.aula13;

public class Cachorro implements Animal {

    //1. Crie uma interface Animal com o metodo emitirSom().
    //   Crie a classe Cachorro que implementa ela e imprime "Au au!".
    //   Na Main, crie um cachorro e chame o metodo.
    @Override
    public void emitirSom(){
        System.out.println("Au Au, Woof!");
    }
    @Override
    public void miar() {
    }
}
