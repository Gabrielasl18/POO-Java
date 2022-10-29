package p1_2016;

public class TesteArvore {
	public static void main(String[] args) {
		Arvore v1 = new Arvore();
		System.out.println(v1.getNome());
		v1.setNome("Acacia");
		Arvore v2 = new Arvore();
		v2.setNome("Ipe");
		teste1(v1,v2);
		System.out.println(v1.getNome());
		System.out.println(v2.getNome());
		v1.a = 10;
		int x = v1.a;
		v1.a = 5;
		v2.a = v1.a;
		System.out.println(x);
		teste2(v1.a,x,v1);
		System.out.println(v1.getNome());
		System.out.println(x);
		System.out.println(v1.a);
		
		System.out.println(v1.b);
		System.out.println(v2.a);
		System.out.println(v2.b);
		teste3(v2);
		System.out.println(v2.getNome());
		System.out.println(v2.a);
	}
	public static void teste1(Arvore v2, Arvore v1) {
		v1.setNome("Abacateiro");
		v1 = v2;
		v1.setNome("Eucalipto");
	}
	public static void teste2(int a, int x, Arvore arv) {
		a = 20;
		x = 15;
		arv.b = 99;
		arv.setNome("Macieira");
		arv = new Arvore();
	}
	public static Arvore teste3(Arvore v2) {
		v2 = new Arvore();
		v2.setNome("Mogno");
		return v2;
	}
}
