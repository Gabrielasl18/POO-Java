package associacao;

public class Professor {
	private String Nome;
	private String Especialidade;
	private Seminario[] seminarios;
	

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public Professor(String nome, String especialidade) {
		super();
		Nome = nome;
		Especialidade = especialidade;
	}
	
	public Professor() {
	}
	public void print() {
		System.out.println("-------------RELATÓRIO DE PROFESSOR------------- ");
		System.out.println("Nome do professor: " + this.Nome);
		System.out.println("Especialidade: " + this.Especialidade);
		if(seminarios != null && seminarios.length !=0) {
		System.out.println("Seminários participantes: ");
			for(Seminario sem : seminarios) {
				System.out.println(sem.getTitulo() + " ");
			}
			return;
		}
		System.out.println("Professor não vinculado a nenhum seminário.");
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEspecialidade() {
		return Especialidade;
	}
	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}
	
}
