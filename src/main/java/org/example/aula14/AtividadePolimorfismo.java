package org.example.aula14;


public class AtividadePolimorfismo {
    public static void main(String[] args) {

        //Atividade1
        Calculadora calculadora = new Calculadora();
        calculadora.calcularArea(43.5);
        calculadora.calcularArea(25.7, 32.8);
        calculadora.calcularArea(9);

        System.out.println("*******Atividade 2*******");
        //Atividade2
        // 2. (mesma classe — muda o TIPO do parâmetro)

        Painel painel = new Painel();
        painel.exibir("String");
        painel.exibir(42 + " Int");
        painel.exibir(false + " Boolean");
        painel.exibir(75.2 + " double");

        System.out.println("*******Atividade 3*******");
        //Atividade 3

        Professora flora = new Professora();
        flora.lancarNota("Erza", 9.9);
        System.out.println(flora.nome = "Flora");
        System.out.println(flora.idade = 30);
        System.out.println(flora.disciplina = "Java e IA");

        Aluna eliza = new Aluna();
        System.out.println(eliza.nome = "Elizabeth");
        System.out.println(eliza.idade = 25);
        System.out.println(eliza.curso = " Aprendiz de Java e IA");

        System.out.println("*******Atividade 4*******");
        //Atividade4

        //Apenas o que a classe mãe contém!
        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Nami";
        estagiaria.idade = 23;
        estagiaria.apresentar();

        Pessoa estagiaria1 = estagiaria;

        System.out.println("*******Atividade 5*******");

        /*Atividade5
  static void mostrarFicha(Pessoa p) {
       p.apresentar();
   }

         */
        System.out.println("*******Atividade 6*******");
        //Atividade6


    }

    }

