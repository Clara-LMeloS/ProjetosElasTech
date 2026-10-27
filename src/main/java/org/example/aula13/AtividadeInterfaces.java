package org.example.aula13;

import java.util.ArrayList;

public class AtividadeInterfaces {
    public static void main(String[] args) {

        //1. Crie uma interface Animal com o metodo emitirSom().
        //   Crie a classe Cachorro que implementa ela e imprime "Au au!".
        //   Na Main, crie um cachorro e chame o metodo.
        Cachorro Bidu = new Cachorro();
        Bidu.emitirSom();


        //2. Agora acrescente a classe Gato, que implementa a mesma interface e
        //   imprime "Miau!". Na main, declare as duas variáveis como Animal:
        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.miar();

       /* DÚVIDAS!
        3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
       e percorra com for-each chamando emitirSom(). Repare que não
       tem nenhum if. Dica:

        ArrayList<String> animais = new ArrayList<>();

         animais.add(new Cachorro());
         animais.add(new Gato());

         for (String animal: animais){
                System.out.println("socuero teste");
*/

        //4. Crie uma interface Notificacao com o metodo enviar(String mensagem).
        //   Crie duas classes que implementam ela: Email e SMS. Cada uma
        //   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
        //   e percorra com for-each, enviando a mesma mensagem.

        ArrayList<Notificacao> notificacoes =  new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for(Notificacao notificar : notificacoes ){
            System.out.println(notificar);
        }


    }
}
