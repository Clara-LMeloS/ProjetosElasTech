package org.example.aula19.interfaces;

public class MongoDb implements BancoDeDados {
  int numero;
    String pessoa;

    public void proibidoBarulhoAposDezHoras() {

    }

    @Override
    public String chamarBanco() {
        return "";
    }

    @Override
    public int getNumero() {
        return numero;
   }


}

