package lista1;

public class TesteCasaJanela {
	public static void main(String[] args) {
		Janela janela1 = new Janela();
		Casa casa1 = new Casa();
		janela1.setCor("preta");
		janela1.setMaterial("vidro");
		casa1.setCor("azul");
		casa1.setNumero(15);
		casa1.setJanela(janela1);
		System.out.println(casa1.getCor() + " - " + casa1.getNumero() + " - " + casa1.getJanela().getCor() + " - " + casa1.getJanela().getMaterial());
	}
}
