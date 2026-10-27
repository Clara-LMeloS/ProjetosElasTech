package org.example.aula19.interfaces.builder;

public class ExemploBuilder {
    public static class Pizza {
        String sabor;
        boolean temQueijo;
        String borda;



        private Pizza(Builder builder){
            this.sabor = builder.sabor;
            this.temQueijo = builder.temQueijo;
            this.borda = builder.borda;
        }


        public static class Builder{
            String sabor;
            boolean temQueijo;
            String borda;

            public Builder sabor(String sabor){
                this.sabor = sabor;
                return this;
            }

            public Builder temQueijo(boolean temQueijo){
                this.temQueijo = temQueijo;
                return this;
            }

            public Builder borda(String borda){
                this.borda = borda;
                return this;
            }

            public Pizza build(){
                return new Pizza(this);
            }
        }

    }


    public class Main {

        public void main(String[] args) {
            Pizza pizza = new Pizza.Builder()
                    .borda("Catupiry")
                    .sabor("Mussarela")
                    .temQueijo(true)
                    .build();

        }
    }
}
