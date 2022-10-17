package lista2;

class NumIntervalo {
	public void soma() {
		int num = 1, soma = 0;
		while(num <= 50000) {
			if(num <= 100 || num > 100 && num >= 137) {
				soma += num;
			}
			num++;
		}
		System.out.println("a soma de todos os numeros de 1 a 50.000 menos os numeros entre 100 e 137: " + soma);
	}
}
public class SomaComIntervalo {
	public static void main(String[] args) {
		NumIntervalo calcular = new NumIntervalo();
		calcular.soma();
	}
}
