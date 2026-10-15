package org.example.aula16;

public class Estudante extends PagamentoBoleto{
    public static void main(String[] args) {
        PagamentoPix pg =  new PagamentoPix();
        PagamentoBoleto pb = new PagamentoBoleto();

        pg.processarPagamento();
        pb.processarPagamento();



    }
    @Override
    public void processarPagamento() {


    }

}

