package lista2;

class NumImpares {
	public void soma() {
		int num, soma = 0;
		for(num = 1; num <= 10000; num++) {
			if(num % 2 != 0) {
				soma += num;
			}
		}
		System.out.println("a soma de todos os numeros impares de 1 a 10.000: " + soma);	
	}
}
public class SomaImpares{
	public static void main(String[] args) {
		NumImpares impares = new NumImpares();
		impares.soma();
	}
}

