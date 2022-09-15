import java.util.HashMap;
import java.util.Map;

public class DataBase {
	public static void main(String[] args) {
		Map<String,Double> m = new HashMap<String,Double>();
            m.put("1234#1",1000.70);
            m.put("553742#3",10000.50);
            m.put("12#2",1300.10);
            m.put("4343#1",1000.80);
            double med = calculaMedia(m,1);//essa chamada deve calcular a média dos salários dos funcionários com código do cargo 1.
            System.out.println(med);
            System.out.println(m.values());
            System.out.println(m.keySet());
	}

	public static double calculaMedia(Map<String,Double> g, int cargo) {
		
			return cargo;
	}
}
//class ABC {
//	//código.
//	//escreva seu código como se ele fosse ser inserido aqui.    
//}