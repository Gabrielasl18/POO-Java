# Programação Orientada à Objetos
___

## Associação
> Associação ocorre quando uma classe possui ATRIBUTOS do tipo de outra classe.
Estamos dizendo que Carro possui Pneu(4 pneus).

![associacao](https://user-images.githubusercontent.com/96033603/188338711-d86e65fb-66d7-4037-930b-793ecc59a1b2.png)

```java
public class Pneu{
	int Pressao;
	
	void roda(){
		System.out.println("Pneu em movimento"); 
	}
}
public class Carro{
	Pneu p1;
	Pneu p2;
	Pneu p3;
	Pneu p4;
	
	void liga(){
		System.out.println("Carro ligado");	
	}
	void desliga(){
		System.out.println("Carro desligado");
	}
}
```

___

## Blocos de Inicialização
> Executado ANTES do construtor, é executado toda vez que vc cria um objeto(não importa onde está no código,ele vai executar primeiro) ele inicializa a variável.                                          
*APENAS ASSIM:*

```java
{

}
```

___ 

