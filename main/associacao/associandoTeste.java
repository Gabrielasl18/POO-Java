package associacaoTeste;

import associacao.Alunos;
import associacao.Local;
import associacao.Professor;
import associacao.Seminario;

public class associandoTeste {
	public static void main(String[] args) {
		Alunos aluno = new Alunos ("Gabriela Lacerda",19);
		Alunos aluno2 = new Alunos ("Joana D'arc",21);
		
		Seminario seminario = new Seminario("Robotic Process Automation");
		Professor prof = new Professor("José","Matemática");
		Local local = new Local("Rio das Ostras","nato");
		
		aluno.setSeminario(seminario);
		aluno2.setSeminario(seminario);
		
		seminario.setProfessor(prof);
		seminario.setLocal(local);
		seminario.setAlunos(new Alunos[]{aluno,aluno2});
		prof.setSeminarios(new Seminario[]{seminario});
		seminario.print();
		prof.print();
		aluno.print();
	}
}
