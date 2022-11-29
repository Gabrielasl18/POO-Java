package lista5;

import java.util.Comparator;
import java.util.List;

public class Utils {
	public static boolean existe(List<Aluno> x, Aluno y) {
		return x.contains(y);
	}
	public static void ordena(List<Aluno> x) {
		x.sort(Comparator.comparing(Aluno::getNome));
	}
}
