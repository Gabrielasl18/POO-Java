package lista4;

public class Velho extends Imovel{
	@Override
	public double getPreco() {
		return this.preco * 0.80;
	}
}
