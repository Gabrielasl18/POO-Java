package CelularTeste;
import CelularClass.CelularClasse;
import CelularClass.Samsung;
import CelularClass.Apple;

public class CelularTeste extends CelularClasse {
	public static void main(String[] args) {
		Apple cel2 = new Apple();
		Samsung cel1 = new Samsung();
		System.out.println(cel1.getColor());
		cel1.isConnected();
		cel1.rangePrice();
		System.out.println(cel2.getColor());
		cel2.isConnected();
		cel2.rangePrice();
	}
}
