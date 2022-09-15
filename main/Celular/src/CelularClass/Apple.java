package CelularClass;

import Lojas.Magazine;

public class Apple extends	CelularClasse {
	private String color = "gold";
	Magazine ger = new Magazine();
		
	@Override
	public void rangePrice() {
		ger.geracoes();
	}
	@Override
	public void logo() {
		System.out.println("Maça mordida");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

