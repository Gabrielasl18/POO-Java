package lista4.br.com.luta;

public class MeioPesado extends Lutador{
	private int id = 2;
	private String categoriaLutador = "Meio Pesado";
	public MeioPesado(String nome, int idade, double peso) {
		super(nome,idade,peso);
		System.out.println(getCategoriaLutador());
		System.out.println("--------------------");
	}
	public String getCategoriaLutador() {
		return categoriaLutador;
	}
	public void setCategoriaLutador(String categoriaLutador) {
		this.categoriaLutador = categoriaLutador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
