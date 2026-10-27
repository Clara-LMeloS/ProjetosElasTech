package org.example.lista;

public class Desenvolvedor extends Funcionarios{
//chamando construtuor
    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()* 1.20;


    }
}
