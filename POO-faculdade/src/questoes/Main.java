package questoes;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cor;
		Mochila[] mochilas = new Mochila[5];
		System.out.println("oi");
		for(int i=0;i<mochilas.length;i++) {
			cor = sc.nextLine();
			mochilas[i].setCor(cor);
		}
	}
}
