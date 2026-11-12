package org.example.aula25.lambda1;

public class Main {
    public static void mostrarTexto(){
        System.out.println("oioi");
    }
    public static void main(String[] args) {
        //nesses exemplos eu estava guardando a ação!

        mostrarTexto();
        Saudacao saudacao = () -> System.out.println("Oi!");
        saudacao.executar();

        Impressora impressoraMaiusculo = (texto) -> System.out.println(texto.toUpperCase());
        Impressora impressoraMinusculo = (texto) -> System.out.println(texto.toLowerCase());

        impressoraMaiusculo.imprimir("Bom dia!");
        impressoraMinusculo.imprimir("Boa tarde!");

        Calculo calculoSoma = (a,b) -> a+b;
        Calculo calculoMultiplicacao = (a,b) -> a*b;
        Calculo calculoRetornaMaior = (a,b) -> Math.max(a,b);

        System.out.println(calculoSoma.calcular(5,7));
        System.out.println(calculoMultiplicacao.calcular(14,16));
        System.out.println(calculoRetornaMaior.calcular(87,56));

    }

}