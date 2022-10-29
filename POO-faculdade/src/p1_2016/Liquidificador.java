package p1_2016;

public class Liquidificador extends Produto implements Ligavel {
	public Liquidificador(double preco, int id) {  // erro na folha
		super(preco, id);
		// TODO Auto-generated constructor stub
	}
	private String marca;
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca  = marca;
	}
	public void ligar() {
		System.out.println("ligado");
	}
}
