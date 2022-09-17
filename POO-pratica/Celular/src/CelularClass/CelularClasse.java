package CelularClass;
import java.util.Scanner;

public class CelularClasse extends BrandClasse {
	Scanner read = new Scanner(System.in);
	private boolean connected = true;

	public boolean isConnected() {
		System.out.println(connected);
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	@Override
	public void logo() {	
	}
	@Override 
	public void rangePrice() {
		
	}
}
