package set;

import java.util.HashSet;
import java.util.Iterator;

/* 
Toda classe que diretamente ou indiretamente implementa iterator, 
precisa implementar iterator, que é como percorre aquela estrutura.
*/

public class HashSetTeste {
	public static void main(String[] args) {
		HashSet x = new HashSet<>();
		x.add("gabi");
		tam(x);
	
	}
	public static void tam(HashSet x) {
		Iterator it = x.iterator();
		double soma = 0;
		while(it.hasNext()) {
			String S = (String) it.next();
			soma += S.length();
		}
		System.out.println(soma/x.size());
	}
}
/* 
List x = new ArrayList(); não faz diferença, mas se criar um método e pôr no parâmetro List x, tem, pois vai generalizar 
e se mudar a List da declaração pra outra interface que tenha List, vai ser mais fácil de manusear e não vai precisar criar vários
outros parâmetros pra englobar as outras classes que não possuem a interface List 
*/
