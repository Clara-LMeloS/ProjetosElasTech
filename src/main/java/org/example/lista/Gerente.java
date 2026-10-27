package org.example.lista;

public class Gerente extends Funcionarios {

    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase()*1.50;
    }
}
