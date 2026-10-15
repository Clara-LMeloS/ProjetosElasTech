package org.example.lista;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;


    public double definirPorte(){
        if(peso <10 ){
            porte = "Pequeno";
        }else if(peso <25){
            porte = "Médio";
        }else{
            porte = "Grande";
        }
        return 0;
    }
}
