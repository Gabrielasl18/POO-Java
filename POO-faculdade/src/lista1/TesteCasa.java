package lista1;

public class TesteCasa {
	public static void main(String[] args) {
		Casa casa1 = new Casa();
		Casa casa2 = new Casa();
		casa1.setCor("azul");
		casa1.setNumero(15);
		casa2.setCor("preta");
		casa2.setNumero(56);
		System.out.println("A casa de número " + casa1.getNumero() + " tem cor " + casa1.getCor());
		System.out.println("A casa de número " + casa2.getNumero() + " tem cor " + casa2.getCor());
	}
}
