package org.example.aula14;

import java.io.Serializable;

public class Gerente  extends Funcionario implements Notificavel, Exportavel {
String quem;

boolean aprovacaoFerias = true;

    public void aprovarFerias(){
        System.out.println(" aprovação: " + aprovacaoFerias);
    }





}
