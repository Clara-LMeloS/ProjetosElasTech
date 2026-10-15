package org.example.aula14;

public class ProfessoraPolimorfismo extends Pessoa {
    String disciplina;

    public void lancarNota(double nota, String aluna) {
        System.out.printf(nome +" lançou nota %.1f " + " para " + aluna);

    }
}
