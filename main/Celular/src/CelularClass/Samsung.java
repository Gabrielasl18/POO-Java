package CelularClass;
import Lojas.Magazine;

public class Samsung extends CelularClasse {
	private String color = "black";
	Magazine lin = new Magazine();
		
	@Override
	public void rangePrice() {
		lin.linhaA();
		lin.linhaS();
		lin.selection();
		System.out.println(lin.getPrice());
		lin.juros();
	}
	@Override
	public void logo() {
		System.out.println("Oval azul com letras brancas.");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
