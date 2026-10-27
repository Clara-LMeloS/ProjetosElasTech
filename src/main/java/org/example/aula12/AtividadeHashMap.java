package org.example.aula12;

import java.util.HashMap;

public class AtividadeHashMap {
    public static void main(String[] args) {

        //1. Crie um HashMap de nomes e idades com três pessoas.
        // Imprima o mapa inteiro e depois use
        // get para mostrar a idade de uma delas.

        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Sam",20);
        idades.put("Alex",21);
        idades.put("Clover",22);

        System.out.println("HashMap completo: " + idades);

        System.out.println("A idade de Clover é: " + idades.get("Clover"));


        //2. Crie um HashMap de produtos e preços.
        // Coloque "café" com valor 5.00,
        // imprima, e depois faça put de "café" DE NOVO
        //  com valor 7.50.
        //   Imprima outra vez e veja o que aconteceu com
        //   o tamanho.

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Café", 5.00);
        System.out.println(produtos);

        produtos.put("Café", 7.50);
        System.out.println(produtos);
        System.out.println(produtos.size());

        //3. Crie uma agenda (nome -> telefone)
        // com duas pessoas.
        // Use containsKey dentro de um if
        // para mostrar o telefone de alguém
        // que está na agenda
        // e de alguém que não está.

        //CONFERIR SE ESSA É A PROPOSTA DO ENUNCIADO!
        HashMap<String,String> agenda = new HashMap<>();
        agenda.put("Yudi", "4002-8922");
        agenda.put("Maisa", "9453-7865");

        if(agenda.containsKey("Maisa")){
            System.out.println("O número de Maisa é: " + agenda.get("Maisa"));
        }
        if(agenda.containsKey("Priscila")){
            System.out.println("Esse número não consta em sua agenda");
        }

        //4. Crie um HashMap de estoque (produto -> quantidade)
        // com dois itens. Use getOrDefault para mostrar
        // a quantidade de um produto que existe
        //   e de um que não existe (devolvendo 0).
        //   Depois tente com get normal
        //   no que não existe e compare.

        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Miojo",25);
        estoque.put("Maionese",13);

        //vai me entregar o valor de miojo ou um valor DEFAULT que eu denomimei ser 0 ao invés de null
        System.out.println( estoque.getOrDefault("Miojo",0));

        //Como eu não passei um valor DEFAULT ele me retorna um Null na resposta!
        System.out.println(estoque.get("Tempero de alho"));

        //5. Crie um HashMap de notas com três alunas.
        //   Imprima o mapa e o tamanho.
        //   Remova uma delas e imprima de novo.

        HashMap<Double, String> mapa = new HashMap<>();
        mapa.put(2.5, "Jessie");
        mapa.put(1.0, "James");
        mapa.put(3.0, "Meowth");

        System.out.println("Equipe Rocket decolando na velocidade da luz!! " + mapa + "O tamanho do HashMap é: " + mapa.size());

        mapa.remove(1.0);

        System.out.println("Lista atualizada: " + mapa);

    }
}
