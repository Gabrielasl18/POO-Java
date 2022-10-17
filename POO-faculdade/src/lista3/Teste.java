package lista3;

public class Teste {
	public static void main(String[] args) {
	Data data1 = new Data();
	ContaBancaria conta1 = new ContaBancaria();
	data1.setDia(07);
	data1.setMes(11);
	data1.setAno(2022);
	conta1.setDataAbertura(07,11,2022);
	conta1.getDataAberturaFormatada();
	}
}
