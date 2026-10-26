package org.example.aula23;

import java.util.ArrayList;

//MEU SUJEITO
public class Canal {
    private ArrayList<Inscrito> inscritos =  new ArrayList<>();
    private String nomeVideo;

    //metodo para adicionar os inscritos na lista
    public void inscricao(Inscrito inscritos) {
        this.inscritos.add(inscritos);
    }
    //metodo para remover os inscritos da lista
    public void desinscrever(Inscrito inscritos) {
        this.inscritos.remove(inscritos);
    }
    // É MEU METODO OBRIGATORIO DA INTERFACE
    private void notificacao(){
        for  (Inscrito inscrito : inscritos) {
            inscrito.receberNotificacao("Vídeo novo na área: " + nomeVideo);
        }
        }
    public void postarVideo(String nomeVideo){
        this.nomeVideo = nomeVideo;
        System.out.println("Novo video postado!: " + nomeVideo);
        notificacao();
    }

}
