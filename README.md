# Programação Orientada à Objetos
___

## Associação
> Associação ocorre quando uma classe possui ATRIBUTOS do tipo de outra classe.
Estamos dizendo que Carro possui Pneu(4 pneus).

 ┌───────────────┐
 │     Carro     │
 ├───────────────┤
 │+ Pneu p1      │
 │+ Pneu p2      │
 │+ Pneu p3      ├─────────┐
 │+ Pneu p4      │         │
 │               │         │
 ├───────────────┤         │    ┌────────────────┐
 │    liga()     │         │    │      Pneu      │
 │    desliga()  │         │    ├────────────────┤
 └───────────────┘         └──► │                │
                                │+ Pressao : int │
                                ├────────────────┤
                                │     rodar()    │
                                └────────────────┘
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
