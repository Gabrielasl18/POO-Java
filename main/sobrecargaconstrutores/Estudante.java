package sobrecargaconstrutores;
/**
 *
 * @author gabriela
 */
public class Estudante {

    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
        this(matricula,nome,notas);//chamando o outro construtor.necessário a primeira linha.
        this.dataMatricula = dataMatricula;
    }
    public Estudante(){// construtores nao têm retornos, nem mesmo void, pode ter mais de 1
        System.out.println("Construtor Default.");
    }
    public void print(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota : notas){
          System.out.println(nota + " ");
        }
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

 
}
