package map;

public class Aluno {
	private String matricula;
	private double notaFinal;
	public Aluno(String mat, double notaF) {
		this.matricula = mat;
		this.notaFinal = notaF;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
}
