package introClassesTeste;

import introClasses.Carro;
/**
Objetos são instâncias de classes. É através deles que (praticamente) todo o processamento ocorre em sistemas 
implementados com linguagens de programação orientadas a objetos.

Um OBJETO é um elemento que representa, no domínio da solução,alguma entidade(abstrata ou concreta) do domínio 
de interesse do problema sob análise.

Um OBJETO adquire um espaço em memória para armazenar seu estado(os valores de seu conjunto de atributos,
definidos pela classe) e um conjunto de operações que podem ser aplicadas ao objeto(o conjunto de métodos 
definidos pela classe).

@author gabriela
 */
public class CarroTeste {
    
      public static void main(String[] args){
        
        Carro carro = new Carro();
        carro.model = "Corsa";
        carro.plate  = "QCarroTJP021";
        carro.maxSpeed = 120f;
        
        System.out.println(carro.plate);
        System.out.println(carro.model);
        System.out.println(carro.maxSpeed);
    }
    
}
