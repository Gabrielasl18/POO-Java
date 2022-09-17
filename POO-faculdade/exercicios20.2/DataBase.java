package questoes;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	public static void main(String[] args) {
		Map<String,Double> m = new HashMap<String,Double>();
		ABC media = new ABC();
		    m.put("1234#1",1000.70);
	        m.put("553742#3",10000.50);
	        m.put("12#2",1300.10);
	        m.put("4343#1",1000.80);
	        media.calculaMedia(m, '1');
	}
}
class ABC {
	public double calculaMedia(Map<String,Double> g, char cargo) {
		String lastCharacter = null;
		double mediaCargo = 0;
		int contCargo = 0;
		for (String key: g.keySet()){  
			System.out.println(key+ " = " + g.get(key));
			lastCharacter = key.substring(key.length() - 1);
			char[] lastChar = lastCharacter.toCharArray();
			char ultimo = lastChar[lastChar.length - 1];
			System.out.println("Last char: " + ultimo);
			if(ultimo == cargo) {
				mediaCargo += g.get(key);
				System.out.println("analista");
				contCargo++;
			}
			else if(ultimo == cargo) {
				mediaCargo += g.get(key);
				System.out.println("gerente");
				contCargo++;
			}
		} 	
		if(cargo == '1') {			
			System.out.println("media analista -> " + (mediaCargo/contCargo));
		}
		else if(cargo == '2') {			
			System.out.println("media gerente -> " + (mediaCargo/contCargo));
		}
		return cargo;
	}
}