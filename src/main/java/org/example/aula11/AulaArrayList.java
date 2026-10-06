package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(10);
        lista.add(100);

        //pra adicionar uma sequencia de numeros ao inves de ter que adicionar 1 por 1.
        lista.addAll(List.of(1,2,65,743,75));


        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
        //me mostrar quem está na posicao 5
        System.out.println(lista.get(5));

        //quero que minha posição 0 vire o numero 98
        lista.set(0,98);
        System.out.println(lista);

        System.out.println(lista.size());

        System.out.println(lista.contains(20));

        System.out.println(lista);
        System.out.println(lista.indexOf(65));

        System.out.println(lista.isEmpty());

    }
}
