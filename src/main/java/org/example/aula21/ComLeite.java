package org.example.aula21;
//CLASSE FILHA
public class ComLeite extends CafeDecorator{


    //estou mandando pra classe MÃE - linhas 7 e 8
    public ComLeite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeEmbrulhado.getDescricao() + " + Leite";
    }

    @Override
    public double getPreco() {
        return cafeEmbrulhado.getPreco() + 2.0;
    }
}
