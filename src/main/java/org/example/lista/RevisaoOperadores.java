package org.example.lista;


import java.util.ArrayList;
import java.util.Scanner;

public class RevisaoOperadores extends Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet meuPet = new Pet();

        //Atividade1
        PetShop animal = new PetShop();
        System.out.printf("FICHA DO PET: " + "\nNome: " + animal.nome
                + "\nEspécie: " + animal.especie + "\nPeso: " + animal.peso);











/*
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



*/









        System.out.println("\n*******Atividade3*******");
        //Atividade3
        System.out.println("Digite o peso do animal: ");
        meuPet.peso = sc.nextDouble();
        meuPet.porte = meuPet.definirPorte();

        System.out.printf("FICHA DO PET: "
                + "\nNome: " + animal.nome
                + "\nEspécie: " + animal.especie
                + "\nPeso: " + animal.peso
                + "\nPorte: " + meuPet.porte);













        System.out.println("\n*******Atividade4*******");
        //Atividade4

        Pet animalPet = new Pet();
        animalPet.nome = animal.nome;
        animalPet.especie = animal.especie;
        animalPet.peso = animal.peso;
        animalPet.porte = meuPet.porte;

        System.out.printf("FICHA DO PET: \n Nome: %s \n espécie : %s \n peso: %.1f \n porte: %s ", animalPet.nome, animalPet.especie, animalPet.peso, animalPet.porte);


        System.out.println("\n*******Atividade5******\n");
        //Atividade5
        System.out.println("Digite o peso do animal: ");
        meuPet.peso = sc.nextDouble();
        System.out.println(animalPet.definirPorte());

















        //Atividade6
        System.out.println("\n*******Atividade6******");
        Pet[] lista = new Pet[5];
        Pet mel = new Pet();
        Pet meowth = new Pet();

        mel.nome = "Mel";
        mel.especie = "Cachorro";
        mel.peso = 8.5;
        mel.porte = mel.definirPorte();

        meowth.nome = "Meowth";
        meowth.especie = "Gato";
        meowth.peso = 4.2;
        meowth.porte = meowth.definirPorte();

        lista[0] = mel;
        lista[1] = meowth;
        System.out.println("---PETS CADASTRADOS---");
        System.out.println(lista[0].nome + " (" + lista[0].especie + ") -" + lista[0].peso + "kg- " + lista[0].porte);













        System.out.println("\n*******Atividade7, 8, 9******");
        //ATIVIDADE7
        int opcao = -1;
        int total = 0;

        ArrayList<Pet> listaPets = new ArrayList<>();

            while (opcao != 0) {
                System.out.println("---PET SHOP---");
                System.out.println("1- Cadastrar pet");
                System.out.println("2- Listar pets");
                System.out.println("3- Consultar pets");
                System.out.println("0- Sair");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        Pet novoPet = new Pet();
                        System.out.println("Nome: ");
                        novoPet.nome = sc.nextLine();
                        System.out.println("Especie: ");
                        novoPet.especie = sc.nextLine();
                        System.out.println("Peso: ");
                        novoPet.peso = sc.nextDouble();
                        sc.nextLine();
                        novoPet.porte = novoPet.definirPorte();
                        System.out.println("Porte: " + novoPet.porte);


                        listaPets.add(novoPet);
                        total++;
                        System.out.println("Pet cadastrado! Agora são: " + total + " pet(s)!");
                        break;


                    case 2:
                        if (listaPets.isEmpty()) {
                            System.out.println("Nenhum pet cadastrado!");
                        }else {
                            System.out.println("Os pets cadastrados são: ");
                            for (int i = 0; i < listaPets.size(); i++)
                                System.out.println(listaPets.get(i).nome + " (" + listaPets.get(i).especie + ") " + listaPets.get(i).peso + " " + listaPets.get(i).porte);
                        }
                        break;


                    case 3:
                        System.out.println("Qual pet você procura?");
                       String nomeCase = sc.next();
                       boolean achou = false;

                       for(int i = 0; i <listaPets.size(); i++) {
                           if (listaPets.get(i).nome.equalsIgnoreCase(nomeCase)) {
                               System.out.println("Encontrado: " + listaPets.get(i).nome + " (" + listaPets.get(i).especie + ") " + listaPets.get(i).peso + " " + listaPets.get(i).porte);
                               achou = true;
                           }
                           }
                            if (!achou){
                            System.out.println("Não encontrado!");
                       }
                        break;

                    case 0:
                            System.out.println("Até logo!");
                        break;
                    default:
                            System.out.println("Opção inválida!");
                }
            }

            //Atividade8


        }
    }





