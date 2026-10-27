package org.example.aula21;
//CAFEDECORATOR É A CLASSE MAE
abstract class CafeDecorator implements Cafe {
//criei uma variavel do tipo da minha interface-CAFÉ
protected Cafe cafeEmbrulhado;

//quando eu passar meu construtor a pessoa é obrigada a passar alguma coisa café que vai pro meu atributo Café cafeEmbrulhado
public CafeDecorator(Cafe cafe){
    this.cafeEmbrulhado = cafe;

}

}
