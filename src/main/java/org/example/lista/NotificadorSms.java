package org.example.lista;

public class NotificadorSms implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando SMS: " + mensagem);

    }
}
