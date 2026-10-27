package org.example.aula12;

import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {
    public static void main(String[] args) {
        /*
        .add("Ana");
        .peek(); ver o primeiro elemento da lista
        .poll(); mandar o elemento embora da lista
        .isEmpty(); se a fila ta vaziq - sempre bom checar antes de começar!
        .size(); tamanho da lista
        .contains("Bia"); se tem algo especifico
        .addAll(List.of("Ana","Bia")); adicionar mais de 1 elemento
        */

        //SEMPRE QUE ESTIVER TRABALHANDO COM ARRADEQUE FAZER if ISEMPTY -BOA PRÁTICA-
        ArrayDeque<String> fila = new  ArrayDeque<>();

        fila.addAll(List.of("Maria", "Natália", "Ana Catarina", "Patricia", "Kerou"));
        fila.add("Annabella");
        fila.add("Flora");
        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println(fila.poll());

        System.out.println(fila);
        fila.poll();

        System.out.println(fila);

        if (fila.isEmpty() == true){

            System.out.println("Adicione um elemento a fila");
        }



    }
}
