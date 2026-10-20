package org.example.lista;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Valor inválido!");
        }else{
        this.preco = preco;
        }

    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Valor inválido!");
        }else{
            this.quantidade = quantidade;
        }

    }

}
