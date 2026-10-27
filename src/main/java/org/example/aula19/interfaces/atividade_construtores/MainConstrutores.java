package org.example.aula19.interfaces.atividade_construtores;

public class MainConstrutores {
    public static void main(String[] args) {

        Agendamento agendamento1 = Agendamento.builder()
                .nomePet("Thor")
                .servico("Banho")
                .horario("14h")
                .observacao("Alergia a shampoo")
                .perfume(true)
                .laco(false)
                .hidratacao(false)
                .desconto(10)
                .build();

        agendamento1.mostrar();

        Agendamento agendamento2 = Agendamento.builder()
                .nomePet("Thor")
                .servico("Banho")
                .horario("14h")
                .observacao("Alergia a shampoo")
                .perfume(true)
                .laco(false)
                .hidratacao(false)
                .desconto(10)
                .build();

        agendamento2.mostrar();


















        /*
        Agendamento pet1 = new Agendamento("Thor", "banho", "14h","Alérgico a shampoo", true,true,false,10);
        Agendamento pet2 = new Agendamento("Luna","Tosa","10h","nenhuma observação", false,false,false,0);
        Agendamento pet3 = new Agendamento("Mel", "Banho", "16h", "Nenhuma observação", false,false,true,0);


       pet1.mostrar();
       pet2.mostrar();
       pet3.mostrar();

         */




    }
}
