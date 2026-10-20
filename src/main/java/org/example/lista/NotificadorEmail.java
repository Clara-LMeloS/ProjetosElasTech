package org.example.lista;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando Email: " + mensagem);

    }
}
