package Lojas;

import java.util.Scanner;

public class Magazine {
	private double price;
	Scanner read = new Scanner(System.in);
	public void linhaS() {
		System.out.println("\t\tLOJA MAGAZINE LUIZA");
		System.out.println("\n------Samsung Galaxy S------\n");
		System.out.println("S20: R$2.000,00");
		System.out.println("S21: R$2.499,00");
		System.out.println("S22: R$5.849,10");
	}
	public void linhaA() {		
		System.out.println("\n------Samsung Galaxy A------\n");
		System.out.println("A03: R$899,10");
		System.out.println("A32: R$1.349,00");
		System.out.println("A52: R$1.529,10");
	}
	public void geracoes() {
		System.out.println("\n------Iphone------\n");
		System.out.println("SE: 3.599,10");
		System.out.println("11: 3.869,10");
		System.out.println("13 Pro Max: 7.649,10");
	}
	public void selection() {
		String model;
		System.out.println("Digite a marca que deseja escolher: ");
		String brand = read.next();
		switch(brand) {
		case "samsung": System.out.println("Diga qual linha deseja escolher: ");
		String line = read.next();
			switch(line) {
			case "S": System.out.println("Diga qual modelo deseja: ");
			model = read.next();
				if(model.equals("S20")) {
					price = 2000;
				}
				else if(model.equals("S21")) {
					price = 2499;
				}
				else if(model.equals("S22")) {
					price = 5849.10;
				}
			break;
			case "A": System.out.println("Diga qual modelo deseja: ");
				model = read.next();
				if(model.equals("A03")) {
				price = 899.10;
				}
				else if(model.equals("A32")) {
					price = 1349.10;
				}
				else if(model.equals("A52")) {
					price = 1529.10;
				}
			break;
			default: System.out.println("voce precisa escolher uma opção.");
			break;
			}
		case "iphone": System.out.println("Diga qual geração deseja escolher: ");
		String ger = read.next();
			if(ger.equals("SE")) {
			price = 3599.10;
			}
			else if(ger.equals("11")) {
			price = 3869.10;
			}
			else if(ger.equals("13")) {
			price = 7649.10;
			}
		default: System.out.println("voce precisa escolher uma opção.");
		break;
		}
	}
	public void juros(){
		int parcelas = 0;
		double J = 0;
		 if(price > 0) {
		System.out.println("Digite o num de parcelas; ");
		parcelas = read.nextInt();
		if(parcelas > 10) {
			J = (0.02 * price) + price;
			J = J/parcelas;
		}
		else {
			J = price/parcelas;
		}
		System.out.println("Deverá pagar " + parcelas + "x de: R$" + J);
		}
		else {
			System.out.println("Escolha primeiro a opção que deseja.");
		}
	}
	public double getPrice() {
		return price;
	}
}
