package lista4.br.com.luta;

public class Main {
	public static void main(String[] args) {
		PesoPesado lut = new PesoPesado("Anderson Silva",45,84);
		PesoMedio lut2 = new PesoMedio("Khabib",31,70);
		PesoPesado lut3 = new PesoPesado("Jon Jones", 32, 92);
		PesoPena lut4 = new PesoPena("Thiago Santos",36,93);
		PesoPesado lut5 = new PesoPesado("Stipe miocic",37,113.5);
		MeioPesado lut6 = new MeioPesado("Max Holloway",28,66);
		PesoPena lut7 = new PesoPena("Yoel Romero",42,84.5);
		Lutador[] lutadores = new Lutador[7];
		int [] luts = new int[1];
		luts[0] = lut.getId();
		lutadores[0] = lut;
		lutadores[1] = lut2;
		lutadores[2] = lut3;
		lutadores[3] = lut4;
		lutadores[4] = lut5;
		lutadores[5] = lut6;
		lutadores[6] = lut7;
		lut.possiveisLutas(lutadores);
	}
}
