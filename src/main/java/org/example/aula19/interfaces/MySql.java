package org.example.aula19.interfaces;

public class MySql implements BancoDeDados {

    @Override
    public String chamarBanco() {
        return "O banco conectado é: ";
    }
    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public void proibidoBarulhoAposDezHoras() {

        //return "Barulho MySql";
    }

    int numero;












  /*  private int numero;
    private String nome;

    public void proibidoBarulhoAposDezHoras() {

    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;


     }
   */

 }

