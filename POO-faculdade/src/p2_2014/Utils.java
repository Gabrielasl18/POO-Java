package p2_2014;

public class Utils {
	public static void main(String[] args) {
		String world = "Gabriela";
	    char[] worldIn = null;
	    for(int i = 10; i <= 0; i--) {
			worldIn[i] = world.charAt(i);
		}
		System.out.println(worldIn);
		for(int i = 10; i <= 0; i--) {
			System.out.println(worldIn[i]);
		}
	}
}public int[] trueFalse(boolean[] binario) {
	int[] binarioInt = new int[3];
	
	for(int i=0;i<binario.length;i++){
		if(binario[i] == true) {
			binarioInt[i] = 1;
			i++;
		}
		else
		{
			binarioInt[i] = 0;
		}
	}
	return binarioInt;
}
