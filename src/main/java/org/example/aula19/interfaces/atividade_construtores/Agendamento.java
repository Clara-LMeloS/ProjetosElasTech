package org.example.aula19.interfaces.atividade_construtores;
import lombok.Builder;

@Builder
public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    String observacao;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    double desconto;
/*
    public Agendamento( String nomePet,String servico,String horario,String observacao,boolean perfume,boolean laco,boolean hidratacao,double desconto){
            this.nomePet = nomePet;
            this.servico = servico;
            this.horario = horario;
            this.observacao = observacao;
            this.perfume = perfume;
            this.laco = laco;
            this.hidratacao = hidratacao;
            this.desconto = desconto;
    }
*/
    public void mostrar(){
          System.out.println("Agendamento:\n" + " Nome: "+ nomePet
                  + "\n Servico: " + servico
                  + "\n horario: " + horario
                  + "\n observacao: " + observacao
                  + "\n Colocar perfume: " + perfume
                  + "\n Colocar laço: " + laco
                  + "\n hidratacao: "+ hidratacao
                  + "\n valor desconto: " +desconto + "\n");

    }


}
