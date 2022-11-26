package map;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTeste {
	public static void main(String[] args) {
		HashMap aluno = new HashMap<>();
	
		System.out.println(aluno.get("gabi"));
		getMediaNotas(aluno);
	}
	public static List getAlunos() {
		ArrayList x = new ArrayList();
		x.add("gab#098");
		x.add("gus#057");
		return x;
	}
	public static double getMediaNotas(Map aluno) {
		double media = 0, soma = 0;
//		Integer soma = 0;
//		for(Map.Entry<String, Integer> notas : alunos.entrySet()) {
//			Integer key = (Integer)notas.getValue();
//			soma += key;
//		}
//		media = soma/alunos.size();
//		return soma;
		
		Collection c = aluno.values();
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Aluno o = (Aluno)it.next();
			soma += o.getNotaFinal();
		}
		media = soma/aluno.values().size();
		return	media;
	}
}
