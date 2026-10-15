package org.example.lista;

import java.util.Scanner;

public class RevisaoOperadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Atividade1
        PetShop animal = new PetShop();
        System.out.printf("FICHA DO PET: " + "\nNome: " + animal.nome
                + "\nEspécie: " + animal.especie + "\nPeso: " + animal.peso);

        System.out.println("\n*******Atividade2*******");
    //Atividade2
        System.out.println("Digite o nome do animal: ");
       animal.nome = sc.nextLine();
        System.out.println("Digite a espécie do animal: ");
       animal.especie = sc.nextLine();
        System.out.println("Digite o peso do animal: ");
       animal.peso = sc.nextDouble();

        System.out.printf("FICHA DO PET: " + "\nNome: " + animal.nome
                + "\nEspécie: " + animal.especie + "\nPeso: " + animal.peso);

        System.out.println("\n*******Atividade3*******");
    //Atividade3  não consegui implementar corretamente o porte -sempre me passa double de peso ou 0.0  -
        System.out.println("Digite o peso do seu animal: ");
       // String texto = String.valueOf(animal.porte);
       // animal.porte = sc.nextDouble();
        if(animal.porte <10){
            System.out.println(" O Porte é Pequeno");
        }else if(animal.porte <25){
            System.out.println(" O Porte é Médio");
        }else{
            System.out.println("O Porte é Grande");
        }

        System.out.printf("FICHA DO PET: "
                + "\nNome: " + animal.nome
                + "\nEspécie: " + animal.especie
                + "\nPeso: " + animal.peso
                + "\nPorte: " + animal.porte);

        System.out.println("\n*******Atividade4*******");

    }

    public static class PetShop {
        String nome = "Mel";
        String especie ="Cachorro";
        double peso =8.5;
        double porte;

    }
}
