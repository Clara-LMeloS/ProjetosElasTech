package org.example.aula23;

public class MainNotificador {
    public static void main(String[] args) {
        Canal canal = new Canal();

        //criando observers
        Seguidor joao = new Seguidor("João");
        Seguidor maria = new Seguidor("Maria");

        //colocando os objetos dentro da lista do canal
        canal.inscricao(joao);
        canal.inscricao(maria);

        canal.postarVideo("Vídeo novo!");

    }
}
