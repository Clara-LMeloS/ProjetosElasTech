package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;

public class AtividadeHashSet {
    public static void main(String[] args) {

        //1. Crie um HashSet de nomes e adicione
        // quatro valores, sendo um deles repetido.
        // Imprima o conjunto e o tamanho.
        //   Repare no que acontece com o repetido.

        HashSet<String> nomesHashSet = new HashSet<>();
        nomesHashSet.add("Annabela Toicinha");
        nomesHashSet.add("Annabela Toicinha");
        nomesHashSet.add("Ana catarina");
        nomesHashSet.add("Patricio");

        System.out.println("Os nomes são: " + nomesHashSet + " e seu tamanho é: " +(nomesHashSet.size()));


        //2. Crie um HashSet de cores usando addAll.
        // Depois use contains dentro
        //   de um if para avisar se a cor
        //   "verde" já está no conjunto ou não.

        HashSet<String> cores = new HashSet();
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Vermelho");

        if (cores.contains("Verde")){
            System.out.println("A cor verde consta no conjunto: " + cores);
        } else{
            System.out.println("A cor verde não consta no conjunto: " + cores);
        }

        //3. Crie um ArrayList com nomes repetidos.
        // Use new HashSet<>(lista) para
        //   tirar os repetidos.
        //   Imprima os dois e compare.

        ArrayList<String> nomesArrayList = new ArrayList<>();
        nomesArrayList.add("Darwin");
        nomesArrayList.add("Gumball");
        nomesArrayList.add("Anaís");
        nomesArrayList.add("Penny");
        nomesArrayList.add("Anaís");
        nomesArrayList.add("Penny");

        System.out.println(nomesArrayList);

        HashSet<String> lista1 = new HashSet<>();
        lista1.addAll(nomesArrayList);

        System.out.println(lista1);

        //4. Crie um HashSet com três CPFs e imprima.
        // Depois remova um deles e
        // imprima de novo, junto com o tamanho.
        HashSet<Integer> cpfHashSet = new HashSet<>();
        cpfHashSet.add(857683291);
        cpfHashSet.add(193857609);
        cpfHashSet.add(948249301);

        System.out.println(cpfHashSet);

        cpfHashSet.remove(948249301);
        System.out.println("A lista contém os CPF's: " + cpfHashSet +
         " e seu tamanho é: "+ cpfHashSet.size());


        //5. Crie um HashSet com três frutas
        // e percorra ele com for,
        // imprimindo uma por linha.

        HashSet<String> frutas = new HashSet<>();
        frutas.add("Laranja");
        frutas.add("Amora");
        frutas.add("Jabuticaba");
        //esse código vai mostrar cada objeto separadamente!! é um for - each. Esse loop percorre cada elemento do conjunto
       for(String fruta : frutas){
           System.out.println(fruta);
       }

       //6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
        //   imprima o isEmpty() de novo.

        HashSet<String> objetos = new HashSet<>();
        System.out.println(objetos.isEmpty());

        objetos.add("Pokebola");
        System.out.println(objetos.isEmpty());

    }
}
