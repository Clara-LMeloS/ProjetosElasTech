package org.example.aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadesAula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 — Faça um programa que peça dois números inteiros
        // e mostre a divisão do primeiro pelo segundo.
        // Se a pessoa digitar 0 no segundo,
        // trate a ArithmeticException
        // e mostre uma mensagem explicando que
        // não dá pra dividir por zero.

        try {

            int n1 = 0;
            int n2 = 0;
            int resultado;

            System.out.print("Digite dois números inteiros para a conta x/y: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            resultado = (n1 / n2);

            System.out.println("Seu resultado é :" + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Não é possível fazer a divisão por 0");
        }


        //2 — Crie um array com 5 notas.
        // Peça uma posição para a pessoa e mostre a nota daquela posição.
        // Se a posição não existir, trate a ArrayIndexOutOfBoundsException
        // e avise que o array só vai de 0 a 4.
try{
    System.out.println("Escolha uma posição de 0 a 4");

    int[] notas = {7, 9, 21, 34, 92};
    int posicao =  sc.nextInt();

    System.out.println("A posição escolhida nos mostra o número: " + notas[posicao]);

    }catch (ArrayIndexOutOfBoundsException e){

    System.out.println("O array só vai de 0 a 4.");
}

        //3 — Peça a idade da pessoa com scanner.nextInt().
        // Se ela digitar um texto em vez de um número,
        // trate a InputMismatchException
        // e mostre uma mensagem pedindo um número.

        int idade;


        try {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.println("Sua idade é : " + idade);
        } catch (InputMismatchException ima) {

            System.out.println("Digite apenas números inteiros.");
        }


        //4 — Crie uma variável String nome = null;
        // e tente imprimir nome.length().
        // Trate a NullPointerException
        // e mostre "O nome não foi preenchido."

        try {
            String nome = null;
            System.out.println(nome.length());

        } catch (NullPointerException npe) {
            System.out.println("O nome não foi preenchido.");
        }


        //5 — Peça um número para a pessoa
        // e mostre o resto da divisão de 100 por esse número.
        // Trate a ArithmeticException para o caso de ela digitar 0.

        try {
            int numero;

            System.out.println("Digite um numero: ");
            numero = sc.nextInt();

            int resto = (100 % numero);

            System.out.println("O resto foi: " + resto);

        } catch (ArithmeticException e) {

            System.out.println("A divisão não pode ser feita por 0");

//6 — Crie um array com 3 nomes.
// Mostre o nome da posição 5 de propósito
// e trate a ArrayIndexOutOfBoundsException com a mensagem
// "Essa posição não existe."
// Depois do try/catch, imprima "O programa continua funcionando."
            try {
                String[] nomes = {"Annabela", "Toicinha", "Catarina"};

                System.out.println(nomes[5]);
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("Essa posição não existe");

            }


        }
    }
}


    
