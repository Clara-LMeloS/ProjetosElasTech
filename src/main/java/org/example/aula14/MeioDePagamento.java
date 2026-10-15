package org.example.aula14;

public interface MeioDePagamento {
    public static void pagar(double valor){
        System.out.println("Pagando: " + valor);
    }
}
