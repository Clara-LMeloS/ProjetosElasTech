package org.example.lista;

public class RevisaoClasseAbstrata {
    public static void main(String[] args) {

        Produto produto = new Produto();
    produto.setNome("Sabre de luz");
    produto.setPreco(70.000);
    produto.setQuantidade(2);

    produto.setPreco(-7);

        System.out.println(produto.getNome()
                + " " + produto.getPreco()
                + " " +  produto.getQuantidade());

        System.out.println("*************ATIVIDADE5***********");

        //C
        Retangulo retangulo = new Retangulo("Retângulo", 4.2,7.3);
        System.out.println("área : " + retangulo.calcularArea());

        //D
        Forma f = new Forma("Teste");
        System.out.println("Forma : " + f);

        System.out.println("*************ATIVIDADE6***********");

        Desenvolvedor dev = new Desenvolvedor("Eduardo", 5.500);
        //System.out.println("Desenvolvedor : " + dev + dev.calcularSalario());

        Gerente gerente = new Gerente("Gerente", 3.000);
        //System.out.println("Gerente : " + gerente + gerente.calcularSalario() );


    }
}
