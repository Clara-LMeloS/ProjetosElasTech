package org.example.aula21;


public class CafeSimples implements Cafe {

    //ESSE É O CAFÉ BASE/PURO, ELE NAO RECEBE UM CAFÉ DENTRO DO CAFÉ!

    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }


}
