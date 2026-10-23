package org.example.aula5;

import java.util.Scanner;

public class Atividade5 {
    public class Atividade5_Aula5 {
        public void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            for (int i = 1; i <= 3; i++) {
                Produto novoProduto = new Produto();

                System.out.println("Digite o nome do produto: ");
                novoProduto.nome = sc.nextLine();
                System.out.println("Digite o valor do produto: ");
                novoProduto.preco = sc.nextInt();
                // temos que colocar o sc.nextline pra nao bugar e pular linha
                sc.nextLine();


                if (novoProduto.preco > 100) {
                    System.out.printf("O produto %s tem o valor %.2f.Produto caro!\n", novoProduto.nome, novoProduto.preco);
                } else {
                    System.out.printf("\"O produto %s tem o valor %.2f. Produto com preço acessível!\n", novoProduto.nome
                            , novoProduto.preco);
                }


            }
        }
    }
}