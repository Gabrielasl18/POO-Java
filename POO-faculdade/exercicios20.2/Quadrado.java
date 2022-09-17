package questoes;

public class Quadrado {
	private double alt;
	private double larg;
	public double getAlt() {
		return alt;
	}
	public void setAlt(double alt) {
		this.alt = alt;
	}
	public double getLarg() {
		return larg;
	}
	public void setLarg(double larg) {
		this.larg = larg;
	}
	public boolean equals(Quadrado B) {
		if(this.larg == B.larg && this.alt == B.alt) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Quadrado A = new Quadrado();
		Quadrado B = new Quadrado();
		A.alt = 2.10;
		A.larg = 1.73;
		B.alt = 1.97;
		B.larg = 1.70;
		System.out.println(A.equals(B));
	}
}
