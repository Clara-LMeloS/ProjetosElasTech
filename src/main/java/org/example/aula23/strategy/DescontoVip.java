package org.example.aula23.strategy;

public class DescontoVip implements Desconto {
    @Override
public double calcularDesconto(double valor) {
    return valor * 0.20;
}
}
