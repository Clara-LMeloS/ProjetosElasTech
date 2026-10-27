package org.example.aula14;

public class Calculadora {

    void calcularArea(double lado) {
        System.out.printf("Lado ao quadrado: " + (lado * lado));
     }

   void calcularArea(double base, double altura){
      System.out.printf("Base e altura: " + (base*altura) + "\n");
    }

   void calcularArea(int raioDoCirculo){

       System.out.printf("Raio do círculo: " + ( 3.14159 * raioDoCirculo * raioDoCirculo) + "\n");
    }
}

