package org.example.aula17;

public class TesteSingleton {
    //É PADRAO DE PROJETO DENTRO VARIAVEL O NOME SER "INSTANCIA" NO SINGLETON
    private static TesteSingleton instancia;


    //CRIANDO O CONSTRUTOR DA CLASSE - É UM METODO QUE EXISTE PARA PREENCHER O OBJETO DA MINHA CLASSE
    //AO PASSAR UM COSNTRUTOR NO () ELE EXIGE QUE NO MAIN EU SEMPRE PASSE UM VALOR DO TIPO DO PARENTESES
    private TesteSingleton(){

    }

    public static  TesteSingleton getInstancia() {
    if(instancia == null){
        instancia = new TesteSingleton();
    }
return instancia;
    }

}
