package org.example.aula25.lambda5;

public interface Operacao {
    int aplicar(int n);

    public static void mostrarResultado(Operacao op, int valor){
        System.out.println("O resultado é: " + op.aplicar(valor));
    }

}
