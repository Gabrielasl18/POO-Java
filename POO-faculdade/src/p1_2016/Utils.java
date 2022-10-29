package p1_2016;
class Utils {
	public int[] trueFalse(boolean[] binario) {
		int[] binarioInt = new int[10];
		
		for(int i=0;i<binario.length;i++){
			if(binario[i] == true) {
				binarioInt[i] = 1;
			}
			else
			{
				binarioInt[i] = 0;
			}
			System.out.println(binarioInt[i]);
		}
		return binarioInt;
	}
	public static void main(String[] args) {
		boolean[] binario = new boolean[10];
		binario[0] = false;
		binario[1] = true;
		binario[2] = false;
		binario[3] = false;
		binario[4] = false;
		binario[5] = true;
		binario[6] = true;
		binario[7] = true;
		binario[8] = false;
		binario[9] = true;
		Utils arrayBin = new Utils();
		arrayBin.trueFalse(binario);
	}
}