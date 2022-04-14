package introMetodos;
/**
 *
 * @author gabriela
 */
public class Estudante {

    private String nome; /*metodos de fora nao podem usar, só se criar um método para colocar os valores*/
    private Integer idade;
    private double[] notas;
    private boolean aprovado;
        
    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(double nota : notas){
            System.out.println("Notas: " +  nota);
        }
    }
    public void printMedia(){
        if(this.notas == null){
            System.out.println("Esse aluno não possui notas.");
            return;
        }
        double[] Notas = this.notas;
        double media = 0.0;
        int i;
        if(this.notas != null){
            for(i=0;i<3;i++){
            media += Notas[i];
            }
        }
        media = media/this.notas.length;
            if(media > 6){
                this.aprovado = true;
                System.out.println("A média é: " + media + " situação: Aprovado!");
                return;
            }else{
                this.aprovado = false;
                System.out.println("A média é: " + media + " situação: Reprovado!");
            }
    }
    public void setNome(String nome) {//método de acesso
        this.nome = nome;
    } // agora meu valor em memória vai receber o argumento. métodos para atribuir valores
    public void setIdade(Integer idade){
        this.idade = idade;  
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }  
    public String getNome(){//métodos de acesso para ler
        return this.nome;
    }
    public Integer getIdade(){
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas; 
    }
    public boolean isAprovado(){//quando se usa o booleano,se usa o is
        return this.aprovado;
    }
}
