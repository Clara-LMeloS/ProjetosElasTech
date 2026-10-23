package org.example.aula21;

public class ComChocolate extends CafeDecorator {

    //ESSE É MEU CONSTRUTOR -
    public ComChocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeEmbrulhado.getDescricao() + " + Chocolate";
    }

    @Override
    public double getPreco() {
        return cafeEmbrulhado.getPreco() + 3.50;
    }
}
