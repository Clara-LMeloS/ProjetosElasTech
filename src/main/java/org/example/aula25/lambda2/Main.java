package org.example.aula25.lambda2;

public class Main {
    public static void main(String[] args) {

        repetirAcao(() -> System.out.println("Oioi"));
    }
    static void repetirAcao(Acao acao) {
        acao.executar();
        acao.executar();
    }

    //Calculo calculoSoma = (a,b) -> a+b;


}
