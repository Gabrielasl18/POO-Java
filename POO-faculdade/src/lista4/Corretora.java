package lista4;

import java.util.Scanner;

public class Corretora {
	public static double precoImoveisSomados(Imovel[] imoveisPreco) {
		double soma = 0;
		for(int i=0;i<imoveisPreco.length;i++) {
			soma += imoveisPreco[i].getPreco();
		}
		return soma;
	}
	public static void main(String[] args) {
		Scanner readLine = new Scanner(System.in);
		Imovel[] imoveis = new Imovel[3];
		imoveis[1] = new Velho();
		imoveis[2] = new Novo();
		imoveis[0] = new Novo();
		imoveis[1].setEndereco("Rua Augusto Cardoso");
		imoveis[1].setPreco(200000);
		imoveis[2].setEndereco("Avenida Brasil");
		imoveis[2].setPreco(150000);
		imoveis[0].setEndereco("Avenida Brasil");
		imoveis[0].setPreco(150000);
		System.out.println(imoveis[1].getPreco());
		System.out.println(precoImoveisSomados(imoveis));
	}
}
