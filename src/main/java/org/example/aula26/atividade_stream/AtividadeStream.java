package org.example.aula26.atividade_stream;

import java.util.List;

public class AtividadeStream {
    public static void main(String[] args) {

        //1 - Dada uma lista de números inteiros de 1 a 6,
        // use Streams para filtrar apenas os números pares
        // e salve o resultado em uma nova lista.
        List<Integer> numeros = List.of(1,2,3,4,5,6);
        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(resultado);


       // 2 - Dada uma lista com nomes de frutas
        // em letras minúsculas, use o map para transformar todas
        // as palavras em letras maiúsculas e imprima cada uma
        // na tela.

        List<String> frutasEmMaiusculo = List.of("Banana","Maçã","Tangerina","Kiwi");

    }
}
