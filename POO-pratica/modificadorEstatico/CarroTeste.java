package modificadorEstaticoTeste;

import modificadorEstatico.Carro;

public class CarroTeste {
	public static void main(String[] args) {
		Carro.setVelocidadeLimite(220);
		Carro c1 = new Carro("BMW",280);
		Carro c2 = new Carro("Audi",275);
		Carro c3 = new Carro("Mercedes",290);
		
		c1.print(); 
		c2.print();
		c3.print();
		
		System.out.println("**************");
		 	
		//c1.setVelocidadeLimite(220); vamos acessar e afetar todos os carros e está errado
		
		//Carro.velocidadeLimite = 220; maneira certa, chamar o nome da classe
		//Atributo estático é um atributo que é compartilhado com todos os objetos.
		c1.print(); 
		c2.print();
		c3.print();
	}
}
