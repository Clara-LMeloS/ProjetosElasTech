package org.example.aula15;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular){
        if (titular==null || titular.isEmpty()){
            System.out.println("Inválido! Mantido: " + this.titular);
        }else{
            this.titular="ana";
            System.out.println("Titular: " + this.titular);
        }
        this.titular = titular;
        }







    }









