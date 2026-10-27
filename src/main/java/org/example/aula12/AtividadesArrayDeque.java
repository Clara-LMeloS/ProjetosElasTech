package org.example.aula12;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class AtividadesArrayDeque {
    public static void main(String[] args) {

//1. Crie uma fila e coloque três pessoas nela com add.
// Imprima a fila
// e quantas pessoas tem.
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Maria Bethânia");
        fila.add("Regina Cazé");
        fila.add("Xuxa");

        System.out.println("A fila: " + fila + " contém " + fila.size() + " posições.");

//2. Crie uma fila com addAll.
//  Use peek para mostrar quem é o próximo e
//  imprima a fila logo depois. Repare que ela não mudou.
        ArrayDeque<String> fila2 = new ArrayDeque<>();
        fila2.addAll(List.of("Cazuza", "Renato Russo", "Rita Lee"));
        System.out.println(fila2.peek() + fila2);

        //3. Mesma fila. Agora use poll para atender o primeiro
        // e imprima a fila depois.
        // Compare com o exercício 2.

        //o pool exclui o item posição 0 da fila.
        System.out.println(fila2.poll() + fila2);


//4. Crie uma fila com três nomes e atenda todos (tirar eles da filinha) usando
//   while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        ArrayDeque<String> nomes = new ArrayDeque<>();
        nomes.add("Lady Gaga");
        nomes.add("Madonna");
        nomes.add("Beyoncé");

        while (!nomes.isEmpty()) {
            System.out.println(nomes.poll());
            System.out.println("Fila vazia!");
            break;
        }

//5.Crie uma fila com três nomes e use contains
//  para responder duas perguntas:
//  se "Bia" está na fila e se "Zoe" está.

        ArrayDeque<String> nomes2 = new ArrayDeque<>();
        nomes.addAll(List.of("Rumi","Mira","Zoey"));

        System.out.println("A lista contém o nome Bia: " + nomes.contains("Bia") + "."
                + " E o nome Zoey: " + nomes2.contains("Zoey"));

//6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
//   - se estiver vazia  -> "Não tem ninguém na fila."
//   - se tiver gente    -> "Próximo: [nome]"
//   Depois adicione uma pessoa e teste de novo.

        // REVER ESSA QUESTÃO
        ArrayDeque<String> fila3 = new ArrayDeque<>();

        if(fila3.isEmpty()){
            System.out.println("Não tem ninguém na fila!");
        }else{
            System.out.println("Próximo: " + fila3);
        }
        fila3.add("Togepi");
        fila3.add("Piplup");
        fila3.peek();

        }
    }