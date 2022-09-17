package questoes;

import java.util.Collections;
import java.util.List;

public class Cachorro {
	private String name;
	private int age;
	private double peso;
	
	Cachorro(){}
	Cachorro(String name, int age, double peso) {
		this.name = name;
		this.age = age;
		this.peso = peso;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
class Dog {
	public static void main(String[] args) {
		List listaCachorros = Dados.getDados();
		Collections.sort(listaCachorros);
		for(int i=0 ; i < listaCachorros.size(); i++){
			 System.out.println(listaCachorros.get(i));
		}
	}
}