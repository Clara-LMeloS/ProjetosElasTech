package org.example.aula13;

public class AtividadeInterfaces {
    public static void main(String[] args) {

        //1. Crie uma interface Animal com o metodo emitirSom().
        //   Crie a classe Cachorro que implementa ela e imprime "Au au!".
        //   Na Main, crie um cachorro e chame o metodo.
        Cachorro Bidu = new Cachorro();
        Bidu.emitirSom();


        //2. Agora acrescente a classe Gato, que implementa a mesma interface e
        //   imprime "Miau!". Na main, declare as duas variáveis como Animal:
        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.miar();
        }

    }
