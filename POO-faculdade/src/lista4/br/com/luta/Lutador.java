package lista4.br.com.luta;

import java.util.ArrayList;

public abstract class Lutador {
	private String nome;
	private int idade;
	private double peso;
	
	public Lutador(String nome, int idade, double peso)
	{
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		System.out.println(nome + "/" + idade + "/" + peso);
	}
	public void possiveisLutas(Lutador [] lutador) {
	 	for(int i=0;i<lutador.length;i++) {
			for(int j=0;j<lutador.length;j++) {
				if(lutador[i].getClass() == lutador[j].getClass() && lutador[j] != lutador[i]) {
					System.out.println(lutador[i].getNome() + " apto para lutar com => " + lutador[j].getNome());
				}		
			}
		}
	}
	// o método vai receber o array
	// vai receber apenas UM lutador de cada cateogira.
	//
	public void sorteioLuta(Lutador [] lutador) {
		ArrayList <Lutador> lutadores = new ArrayList<Lutador>(); 
		for(int i=0;i<lutadores.size();i++) {
			System.out.println(lutadores.get(i));
			if(lutador[i] == )
//			Lutador index = (Lutador)(Math.random() * lutadores.size()); 
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
