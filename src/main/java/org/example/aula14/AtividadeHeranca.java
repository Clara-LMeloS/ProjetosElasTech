package org.example.aula14;

public class AtividadeHeranca {
    public static void main(String[] args) {

        //Atividade1
        Aluna novaAluna =  new Aluna();
        novaAluna.nome = "Lucy";
        novaAluna.idade = 21;

        novaAluna.apresentar();

        //Atividade2
    novaAluna.curso = "Astronomia";
    novaAluna.apresentar();
    novaAluna.estudar();

         //Atividade3
        Aluna novaAluna1 = new Aluna();
        Professora novaProfessora = new Professora();

        novaAluna1.nome = "Wendy";
        novaAluna1.idade = 15;
        novaAluna1.curso = "Aerodinâmica";
        novaProfessora.nome = "Mirajane";
        novaProfessora.curso = "Teologia";


        novaAluna1.apresentar();
        novaAluna1.estudar();
        novaProfessora.lancarNota(novaAluna1.nome, 9.7 );
        System.out.printf("\n");


        //Atividade4

        novaProfessora.apresentar();
        System.out.printf("\n");
        novaAluna1.apresentar();
        System.out.println("\n");

        //Atividade5
    Diretora novaDiretora = new Diretora();
    novaDiretora.nome = "Carla";
        novaDiretora.baterPonto();
        novaDiretora.difinirMeta();
        novaDiretora.aprovarFerias();

    //Atividade6

        Gerente novaGerente = new Gerente();

        novaGerente.nome = "Sonic";
        novaGerente.baterPonto();
        novaGerente.aprovarFerias();
        Notificavel.notificar();
        Exportavel.exportar();



    }
}
