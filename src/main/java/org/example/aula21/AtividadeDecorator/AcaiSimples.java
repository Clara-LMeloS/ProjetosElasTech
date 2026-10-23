package org.example.aula21.AtividadeDecorator;

public class AcaiSimples implements Acai{

    @Override
    public String getDescricao() {
        return "Açaí simples";
    }

    @Override
    public double getPreco() {
        return 12.00;
    }
}
