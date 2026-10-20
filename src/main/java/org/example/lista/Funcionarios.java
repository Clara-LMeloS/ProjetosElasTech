package org.example.lista;

public abstract class Funcionarios {

    private String nome;
    private double salarioBase;

    public Funcionarios (String nome, double salarioBase){
        this.nome = nome;
        setSalarioBase(salarioBase);
      //  this.salarioBase = salarioBase;
    }
    public String getNome(){
        return nome;
    }
    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        if(salarioBase <= 0){
            this.salarioBase = salarioBase;
        }else{
            System.out.println("Valor inválido! O salário não pode ser negativo.");
        }

    }
    public abstract double calcularSalario();


}
