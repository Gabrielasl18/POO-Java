package p1_2016;

public class Chocolate extends Produto implements Comestivel {
	public Chocolate(double preco, int id) {
		super(preco, id);
		// TODO Auto-generated constructor stub
	}
	private String tipo;
	public String getTipo() {
		return this.tipo;
	}
	public void come() {
		System.out.println("Comendo");
	}
}
