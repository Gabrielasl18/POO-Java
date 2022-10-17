package lista3;

public class MainContaData {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setDataAbertura(12,05,2012);
		conta1.setSaldo(1);
		System.out.println(conta1.getDataAberturaFormatada());
		System.out.println(conta1.getSaldoFormatado());
		conta1.depositar(200);
		conta1.depositar(129);
		conta1.depositar(12);
		conta1.sacar(129);
	}
}
