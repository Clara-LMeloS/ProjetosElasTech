package org.example.aula13;

import java.util.ArrayList;

public class AulaForEach {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Raye");
        nomes.add("Olivia");

        for(String nome : nomes){
            System.out.println(nome);
        }


    }

}
