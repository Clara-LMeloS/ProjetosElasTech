package org.example.aula13;

import java.util.ArrayList;

public class AtividadesForEach {
    public static void main(String[] args) {

        //1. Crie um array (não arrayList, array normal)
        // com 4 nomes e imprima todos usando for-each,
        // um por linha.

        //o for-each sempre vai imprimir em sequência!
        String[] nomes = {"Chappel","Sabrina","Doechi","Raye"};
       for(String nome : nomes){
           System.out.println(nome);
       }
        String[] nomes3 = {"Chappel","Sabrina","Doechi","Raye"};
        for(int i =0; i <4; i++){
            System.out.println(nomes[i]);
        }

       //2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
        ArrayList<Integer> notas = new ArrayList<>();
       notas.add(54);
       notas.add(85);
       notas.add(13);
       notas.add(35);
       notas.add(72);

       for(Integer nota : notas){
           System.out.println(nota);
       }

       //3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
        //   todas e mostrar a soma e a média.

        //NAO ENTENDI COMO FAZER
        int[] notas2 = {8,6,10,7};
       int somar = 0;

       for(int nota2 : notas2) {
           somar = (somar + nota2);
           System.out.println("A soma é: " + somar);
       }

       //4. Com um array de nomes, use for-each e um if para contar quantos
           //   têm mais de 5 letras. Mostre o total. Dica: usem o metodo length.

           //como eu faço pra nao rodar 5x?
           String[] pokemons = {"Mini","Growlithe","Pikachu","Togepi","Piplup"};
           for(String pokemon : pokemons){

               if (pokemon.length() >5) {
                   System.out.println("o nome: " + pokemon +  " tem mais de 5 letras. Sua quantidade de letras é: " + pokemon.length());
               }
           }

       //5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
           //   usando o índice. Deixe os dois na mesma classe e compare.
           System.out.println("A resposta da questão 5 está junto da questão 1.");


       }


    }
