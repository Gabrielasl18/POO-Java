package lista4;


/* Corrigido - erro ao chamar um método não estático sem instânciar a classe
 * 
 * solução - instanciar um objeto ou passar o método chamado para estático
 * 
 * metódos estáticos geralmente utilizados visando o compartilhamento de informações entre os objetos
 * e para acesso direto aos atributos da classe, sem necessidade de existir algum objeto instanciado na classe
 * 
 * */
public class Processa {
	public static void main(String[] args) {
		System.out.println(calcula(2,3));
	}
	public static double calcula(double a, double b) {
		return (a+b) * (a*0.1) + (b*0.9);
	}
}
