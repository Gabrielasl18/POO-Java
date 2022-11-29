package lista5;

public class Aluno {
	private String id;
	private String nome;
	private double nota;
	
	public Aluno(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public boolean equals(Object o) {
		if(o instanceof Aluno) {
			Aluno a = (Aluno) o;
			if(this.id.equals(a.id)) {
				return true;
			}
		}
	return false;
	}
	public String toString() {
		return this.id + this.nome + this.nota;
	}

}
