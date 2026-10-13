package org.example.aula14;

public interface Notificavel {

    String notificar = "PLING!* sua compra chegou!";

    public static void notificar() {
        System.out.println( notificar);
    }

}
