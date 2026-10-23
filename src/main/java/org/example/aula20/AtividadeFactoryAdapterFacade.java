package org.example.aula20;

public class AtividadeFactoryAdapterFacade {
    public static void main(String[] args) {

        Animal cachorro = AnimalFactory.getAnimal("cachorro");
        Animal gato = AnimalFactory.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();

    }
}