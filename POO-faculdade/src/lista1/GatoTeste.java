package lista1;

public class GatoTeste {
	public static void main(String[] args) {
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		Gato gato3 = new Gato();
		gato1.setCor("preto");
		gato1.setIdade(19);
		gato1.setNome("Romeu");
		gato1.setVivo(true);
		gato2.setCor("branco");
		gato2.setIdade(3);
		gato2.setNome("Juju");
		gato2.setVivo(true);
		gato3.setCor("cinza");
		gato3.setIdade(20);
		gato3.setNome("Bartolomeu");
		gato3.setVivo(false);
		System.out.println("pet 1: " + gato1.getNome() + " - " + gato1.getIdade() + " - " + gato1.getCor() + " - " + gato1.getVivo());
		System.out.println("pet 2: " + gato2.getNome() + " - " + gato2.getIdade() + " - " + gato2.getCor() + " - " + gato2.getVivo());
		System.out.println("pet 3: " + gato3.getNome() + " - " + gato3.getIdade() + " - " + gato3.getCor() + " - " + gato3.getVivo());
	} 
}
