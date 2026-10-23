package org.example.aula20;

public class AnimalFactory {


   static Animal getAnimal(String animal){

            if(animal.equals("cachorro")){
               return new Cachorro();
            } else if (animal.equals("gato")) {
                return new Gato();
            }
       throw new IllegalArgumentException("tipo de animal inválido!");
    }
}


