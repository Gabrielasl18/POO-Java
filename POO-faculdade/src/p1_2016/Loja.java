package p1_2016;

import java.util.ArrayList;

public class Loja {
	private int id;
	private String nome;
	private ArrayList <Produto> produtosVendidos = new ArrayList<Produto>();
	private ArrayList <String> estoque = new ArrayList<String>();
	
	public double faturamentoBruto() {
		int totalVendidos = quantidadeProdutosVendidos();
		int totalLigaveis = quantidadeProdutosLigaveisVendidos();
		int totalNaoLigaveis = totalVendidos - totalLigaveis;
		
		return totalLigaveis + totalNaoLigaveis;
	}
	
	public int quantidadeProdutosVendidos() {
		int quantVendidos = 0;
		for(int i=0;i < this.produtosVendidos.size();i++) {
			quantVendidos++; // erro no papel - não inicializei a variável
		}
		return quantVendidos;
	}
	public int quantidadeProdutosLigaveisVendidos() {
		int quantVendidos = 0;
		for(int i=0; i < this.produtosVendidos.size(); i++) {
			if(produtosVendidos.get(i) instanceof Ligavel) {
				quantVendidos++;
			}
		}
		return quantVendidos;
	}
	public void imprimirRelatorioVenda() {
		for(int j=0; j<produtosVendidos.size(); j++) {
			
			System.out.println("id: " + produtosVendidos.get(j).getId() + "preco: " + produtosVendidos.get(j).getPreco());
			if(produtosVendidos.get(j) instanceof Carro) {
				Carro car = new Carro(produtosVendidos.get(j).getPreco(),produtosVendidos.get(j).getId());
				car = produtosVendidos.clone();
				System.out.println(car.getPlaca());
				System.out.println("carro");
			}
			else if(produtosVendidos.get(j) instanceof Liquidificador) {
				Liquidificador liq = new Liquidificador(produtosVendidos.get(j).getPreco(),produtosVendidos.get(j).getId());
				System.out.println("liquidificador");
				System.out.println(liq.getMarca());
			}
			else if(produtosVendidos.get(j) instanceof Chocolate) {
				Chocolate choc = new Chocolate(produtosVendidos.get(j).getPreco(),produtosVendidos.get(j).getId());
				System.out.println(choc.getTipo());
				System.out.println("chocolate");
			}
		}
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getEstoque() {
		return estoque;
	}

}
