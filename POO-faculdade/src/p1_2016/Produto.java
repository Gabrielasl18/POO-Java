package p1_2016;

public abstract class Produto {
	private double preco;
	private int id;
	
	public Produto(double preco, int id) {
		this.preco = preco;
		this.id = id;
	}
	public double getPreco() {
		return this.preco;
	}
	public int getId() {
		return this.id;
	}
}
