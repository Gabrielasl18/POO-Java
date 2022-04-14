package sobrecargametodos;
/**
 *
 * @author gabriela
 */
public class Funcionario {
    private String nome;
    private String CPF;
    private double salario;
    private String RG;

    public Funcionario(String nome, String CPF, double salario, String RG){//construtor = sem retorno, sem tipo e com nome da classe
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.RG = RG;
    }
    public Funcionario(){//construtor 2, ou seja, 2 formas de construir o objeto.

    }

    public void init(String nome, String CPF, double salario){
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }
    public void init(String nome, String CPF, double salario, String RG){//adicionando String RG do jeito certo. 
        init(nome,CPF,salario);
        this.RG = RG;
    }
    public void print(){
        System.out.println(this.nome);//this variável de referência para o objeto
        System.out.println(this.CPF);
        System.out.println(this.salario  );
        System.out.println(this.RG);
    }
    public void setRG(String RG){
        this.RG = RG;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setsalario(double salario){
        this.salario = salario;
    }
    public String getRG(){
        return this.RG;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.CPF;
    }   
    public double getsalario(){
        return this.salario;
    }
}
