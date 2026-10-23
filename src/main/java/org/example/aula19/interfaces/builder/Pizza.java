package org.example.aula19.interfaces.builder;
import lombok.Builder;

@Builder
public class Pizza {

    private static ExemploBuilder.Pizza.Builder builder() {
        ExemploBuilder.Pizza pizza = Pizza.builder().borda("Catupiry").sabor("Estrogonofe").temQueijo(true).build();

        return null;
    }
}