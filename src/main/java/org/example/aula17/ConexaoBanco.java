package org.example.aula17;

public class ConexaoBanco {
    //SEMPRE TEM QUE SER INSTANCIA PRA SINGLETON
    private static ConexaoBanco instancia;

    //MEU CONSTRUTOR -  PRA SINGLETON TEM QUE SER O MESMO NOME DA CLASSE E SEM RETORNO
    private ConexaoBanco(){


    }
    //criando o acesso pra todo mundo poder acessar ela!
    public static ConexaoBanco getInstancia(){
        //fazer verificacao pra ver se ja foi criado um NEW
        if(instancia == null){
            instancia= new ConexaoBanco();
        }
        return instancia;
    }


}
