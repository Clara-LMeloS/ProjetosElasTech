package org.example.lista;

import org.example.aula13.Animal;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RevisaoOperadores extends Pet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet meuPet = null;

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
    //Atividade3
        System.out.println("Digite o peso do animal: ");
      //  meuPet.definirPorte();

        if(animal.peso <10 ){
            animal.porte = "Pequeno";
        }else if(animal.peso <25){
            animal.porte = "Médio";
        }else{
            animal.porte = "Grande";

        }
        System.out.printf("FICHA DO PET: "
                + "\nNome: " + animal.nome
                + "\nEspécie: " + animal.especie
                + "\nPeso: " + animal.peso
                + "\nPorte: " + animal.porte);


        System.out.println("\n*******Atividade4*******");
    //Atividade4

        Pet animalPet = new Pet();
        animalPet.nome = animal.nome;
        animalPet.especie = animal.especie;
        animalPet.peso = animal.peso;
        animalPet.porte = animal.porte;

              System.out.printf("FICHA DO PET: "
              + "\nNome: " + animalPet.nome
              + "\nEspécie: " + animalPet.especie
              + "\nPeso: " + animalPet.peso
              + "\nPorte: " + animalPet.porte);


       System.out.println("\n*******Atividade5******");
       //Atividade5
        meuPet = new Pet();
        System.out.println("Digite o peso do animal: " + sc.nextDouble());
        meuPet.peso = meuPet.definirPorte();


      //Atividade6
        System.out.println("\n*******Atividade6******");
        Pet[] pets = new Pet[5];
        Pet mel = new Pet();
        meuPet.nome = mel.nome;

        pets[0] = meuPet;
        pets[1] = animalPet;
        pets[2] = animalPet;
        pets[3] = animalPet;
        pets[4] = animalPet;

        System.out.println("---PETS CADASTRADOS---");
        for (Pet p : pets) {
            System.out.println(p);
        }

    }

    public static class PetShop {
        String nome = "Mel";
        String especie = "Cachorro";
        double peso = 8.5;
        String porte ;



    }
}
