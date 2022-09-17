package associacao;

public class Alunos {
	private String nome;
	private int idade;
	private Seminario seminario;

	
	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		if(this.seminario != null) {
			System.out.println("Seminario inscrito: " + this.seminario.getTitulo());
		}else {
			System.out.println("Não está inscrito em nenhum seminário.");
		}
	}
	public Alunos(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public Alunos() {
		
	}
	public Seminario getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
