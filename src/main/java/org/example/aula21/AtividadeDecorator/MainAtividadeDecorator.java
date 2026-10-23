package org.example.aula21.AtividadeDecorator;

public class MainAtividadeDecorator {
    public static void main(String[] args) {

        //Açaí com granola + descrição + preço
        Acai primeiroPedido = new ComGranola(new AcaiSimples());
        System.out.println(primeiroPedido.getDescricao() + " = R$" + primeiroPedido.getPreco());

        //Açaí com granola e morango + descrição + preço
        Acai segundoPedido = new ComMorango(new ComGranola(new AcaiSimples()));
        System.out.println(segundoPedido.getDescricao() + " = R$" + segundoPedido.getPreco());

    }


}
