package lista5;

import java.util. *;

public class Utils {
	public static boolean existe(List<Aluno> x, Aluno y) {
		return x.contains(y);
	}
	public static void ordena(List<Aluno> x) {
		x.sort(Comparator.comparing(Aluno::getNome));
	}
	public static Map<String, Aluno> retornaDados(Set conjuntoAlunos) {
		Map<String,Aluno> mapaAlunos = new HashMap<String,Aluno>();
		Iterator it = conjuntoAlunos.iterator();
		while(it.hasNext()) {
			String k = it.next().toString();
			String arrayK [] = k.split("#");
			if(arrayK[3].equals("E")) {
				AlunoEspecial alunoE = new AlunoEspecial(arrayK[0]);
				alunoE.setNome(arrayK[1]);
				alunoE.setNota(Double.parseDouble(arrayK[2]));
				mapaAlunos.put(arrayK[0], alunoE);
				System.out.println("aluno E criado.");
			}
			else if(arrayK[3].equals("R")){
				AlunoRegular alunoR = new AlunoRegular(arrayK[0]);
				alunoR.setNome(arrayK[1]);
				alunoR.setNota(Double.parseDouble(arrayK[2]));
				mapaAlunos.put(arrayK[0], alunoR);
				System.out.println("aluno R criado.");
			}
		
		}
		return mapaAlunos;
	}
}	
