package p1_2016;

public class Carro extends Brinquedo implements Ligavel {
	private String placa;
	public Carro(double preco, int id) {  // erro na folha
		super(preco, id);
		// TODO Auto-generated constructor stub
	}
	
	public String getPlaca() {
		return this.placa;
	}
	public void ligar() {
		System.out.println("ligado");
	}
}
