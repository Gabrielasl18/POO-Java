package lista5;

import java.util. *;

public class Utils {
	public static boolean existe(List<Aluno> x, Aluno y) {
		return x.contains(y);
	}
	public static void ordena(List<Aluno> x) {
		x.sort(Comparator.comparing(Aluno::getNome));
	}
	public Map<String, Aluno> retornaDados(Set conjuntoAlunos) {
		Map<String,Aluno> mapaAlunos = new HashMap<String,Aluno>();
		Iterator it = conjuntoAlunos.iterator();

		while(it.hasNext()) {
			String k = it.next().toString();
			System.out.println(k);
			String arrayK [] = k.split("#");
			if(arrayK[1].equals("E")) {
				AlunoEspecial alunoE = new AlunoEspecial(arrayK[0]);
				System.out.println("nome: ...");
				System.out.println("notas: ...");
				alunoE.setNota(7);
				mapaAlunos.put(arrayK[0], alunoE);
				System.out.println("aluno E criado.");
			}
			else if(arrayK[1].equals("R")){
				AlunoRegular alunoR = new AlunoRegular(arrayK[0]);
				System.out.println("nome: ...");
				System.out.println("notas: ...");
				alunoR.setNota(8); 
				mapaAlunos.put(arrayK[0], alunoR);
				System.out.println("aluno R criado.");
			}
			else {
				
			}
		}
		return mapaAlunos;
	}
}	
