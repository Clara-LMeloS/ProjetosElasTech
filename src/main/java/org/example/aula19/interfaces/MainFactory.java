package org.example.aula19.interfaces;

import java.util.Scanner;

public class MainFactory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual banco deseja utilizar? Digite \n 1  - MySql \n - MongoDb");
        int opcao = sc.nextInt();

        //outra forma de instanciar
       BancoDeDados banco = BancoDeDadosFactory.criar(opcao);
       banco.proibidoBarulhoAposDezHoras();











        BancoDeDados novoOracle = new Oracle();
        novoOracle.chamarBanco();
        System.out.println(novoOracle.getNumero());

        }
    public static void conectarBanco(BancoDeDados banco) {
        banco.chamarBanco();
        banco.getNumero();
    }
        }





/*
        //criando a partir da classe
    MySql mySql = new MySql();
    mySql.proibidoBarulhoAposDezHoras();
    mySql.getNumero();

    //criando a partir da interface
      BancoDeDados mongoDb = new MongoDb();
      mongoDb.proibidoBarulhoAposDezHoras();
      mongoDb.getNumero(); //não consequimos acessar o Int numero criado em MySql
      conectarBanco(mySql);

    }

 */



