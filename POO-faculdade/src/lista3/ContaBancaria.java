package lista3;

public class ContaBancaria {
	  private double saldo = 0.0;
	  private Data dataAbertura = new Data();

	  public double getSaldo() {
	    return this.saldo;
	  }

	  public void setSaldo(double saldo) {
	    this.saldo = saldo;
	  }

	  public Data getDataAbertura() {
	    return this.dataAbertura;
	  }

	  public void setDataAbertura(int dia, int mes, int ano) {
	    this.dataAbertura.setDia(dia);
	    this.dataAbertura.setMes(mes);
	    this.dataAbertura.setAno(ano);
	  }

	  public String getDataAberturaFormatada() {
		String dia = String.valueOf(dataAbertura.getDia());
		String mes = String.valueOf(dataAbertura.getMes());
		String ano = String.valueOf(dataAbertura.getAno());
		
	    return dia + "/" + mes + "/" + ano;
	  }
	  
	  public String getSaldoFormatado() {
		  String saldoFormatado = Double.toString(this.saldo);
		  return "R$ " + saldoFormatado;
	  }
	  
	  public void depositar(double valorAdicionado) {
		  this.saldo += valorAdicionado;
		  System.out.println("saldo atual: " + saldo);
	  }
	  
	  public void sacar(double valorASacar) {
		  if(valorASacar > this.saldo) {
			  System.out.println("valor do saco menor que o valor em conta.");
		  }
		  else {
			  this.saldo -= valorASacar;
			  System.out.println("saldo atual: " + saldo);
		  }
	  }
	}
