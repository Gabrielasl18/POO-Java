/*
  								UML
 CARDINALIDADE,quer dizer qual tipo de relacionamento eles têm
 
 (1) Pessoa deve estar cadastrada OBRIGATORIAMENTE em 1 departamento.
 (0..1) Pessoa deve estar cadastrada OBRIGATORIAMENTE em 0 ou 1 departamentos.
 (1..*) Pessoa deve estar cadastrada OBRIGATORIAMENTE em 0 ou + departamentos.
 (*) Pessoa deve estar cadastrada OBRIGATORIAMENTE em 0 ou + departamentos; 
 
 */
package modificadorEstatico;

public class Cliente {
	// 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe;
	// 1 - Alocado espaço na memória para o objeto que será criado;
	// 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explícitos;
	// 3 - Bloco de inicialização é exeecutado;
	// 4 - O construtor é executado.
	
	private static int[] parcelas; //vamos executar só uma vez, por conta do static
	static {	// só sera executado 1 vez
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicializacao estatico");
		for(int i=1;i<=100;i++) {
			parcelas[i-1] = i;
		}
	}
	public Cliente() {
		
	}
	public static int[] getParcelas() {
		return parcelas;
	}
	

}
