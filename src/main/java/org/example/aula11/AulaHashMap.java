package org.example.aula11;
import java.util.HashMap;

public class AulaHashMap {
    public static void main(String[] args) {

        HashMap <String, String> emails = new HashMap();

        emails.put("Anne", "anne@gmail.com");
        emails.put("posicao 2", "qualquer coisa");

        System.out.println(emails.get("Anne"));
        System.out.println(emails.get("posicao 2"));

        //se a posicao que eu buscar nao existir vai exibir a mensagem DEFAULT
        System.out.println(emails.getOrDefault("Olá", "posição inválida"));

        //vai me mostrar quais são as minhas chaves.
        System.out.println(emails.keySet());
        //vai me mostrar quais são meus valores.
        System.out.println(emails.values());

        System.out.println(emails.containsKey("popopopipipi"));

    }


}
