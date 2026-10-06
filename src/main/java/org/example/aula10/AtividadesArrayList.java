package org.example.aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadesArrayList {
    public static void main(String[] args) {

        //- Crie uma lista vazia de nomes.
        // Adicione três nomes e imprima a lista inteira.

        ArrayList<String> listanomes = new ArrayList<>();
        listanomes.add("Annabela");
        listanomes.add("Toicinha");
        listanomes.add("Catarina");

        System.out.println(listanomes);

        //- Crie uma lista já preenchida com quatro frutas.
        // Imprima a primeira, a última e quantas frutas tem.

        ArrayList <String> frutas = new ArrayList<>(List.of("Abacate", "Kiwi", "Romã", "Manga"));

        System.out.println(frutas.get(0));
        System.out.println(frutas.get(3));
        System.out.println(frutas.size());

        //- Crie uma lista com quatro nomes.
        // Troque o nome da posição 2 por outro
        // e imprima a lista antes e depois.

        ArrayList <String> listaQuatroNomes = new ArrayList<>(List.of("Michelangelo","Donatello","Raphael","leonardo"));
        System.out.println(listaQuatroNomes);
        listaQuatroNomes.set(1, "Mestre Splinter");
        System.out.println(listaQuatroNomes);

        //- Crie uma lista com quatro cidades.
        // Remova a da posição 1 e imprima quantas sobraram.

        ArrayList <String> listaCidades = new ArrayList<>(List.of("Campinas", "Cascavel", "Chapecó", "Cabreúva"));
        listaCidades.remove(1);
        System.out.println(listaCidades.size());

        //- Crie uma lista com seis nomes
        // e imprima todos usando um laço,
        // no formato `"0: Ana"`.
        // (Dica: i + ": " + comando para pegar posição da lista)

        ArrayList <String> listaSeisNomes = new ArrayList<>(List.of("Roberta", "Mia Colucci", "Lupita", "Diego", "Miguel", "Giovanni"));

        //se eu colocar <= me mostra o erro que a lista está maior que o INDEX. Não existe nome a ser adiconado após o ultimo e ele traria +1 variável a minha lista, por isso precisa ser menor.
        for (int i = 0; i < listaSeisNomes.size(); i++) {

            System.out.println(i + ": " +listaSeisNomes.get(i));
        }

        //- Crie uma lista com cinco nomes.
        // Peça um nome à pessoa e diga se ele está na lista
        // e em qual posição. Se não estiver, avise.

        String nome5;

            ArrayList<String> listaCinco = new ArrayList<>(List.of("Lucy", "Natsu", "Gray", "Erza", "Happy"));
            System.out.println(listaCinco);
            System.out.println("Digite um nome: ");

            Scanner sc = new Scanner(System.in);
            nome5 = sc.nextLine();


        if (listaCinco.contains(nome5)) {
            System.out.println("Seu nome está na lista e na posição: " + listaCinco.indexOf(nome5));
        }else{
            System.out.println("Seu nome não está na lista.");
        }
        }


    }

