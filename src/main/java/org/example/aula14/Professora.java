package org.example.aula14;

public class Professora extends Aluna {

    String disciplina;
//Atividade1
    public void lancarNota(String aluna, double nota){
        System.out.printf(nome + " lançou a nota: "
                + nota + " para a aluna: " + aluna);
    }
//Atividade 2
    @Override
    public void apresentar() {

        System.out.println("Oi, sou " + nome + " e ensino " + curso);

    }
}
