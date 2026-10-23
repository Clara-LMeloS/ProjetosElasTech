package org.example.aula21;

public class MainDecorator {
    public static void main(String[] args) {

        //so cafe puro
       Cafe primeiroPedido = new CafeSimples();
        System.out.println(primeiroPedido.getDescricao() + " = R$" + primeiroPedido.getPreco());

        //cafe com leite
       Cafe segundoPedido = new ComLeite(new CafeSimples());
        System.out.println(segundoPedido.getDescricao()+ " = R$" + segundoPedido.getPreco());

        //cafe com leite E chocolate
       Cafe terceiroPedido = new ComChocolate(new ComLeite(new CafeSimples()));
        System.out.println(terceiroPedido.getDescricao() + " = R$" + terceiroPedido.getPreco());
    }
}
