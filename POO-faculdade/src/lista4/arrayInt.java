package lista4;

class arrayInt{
	
	public static void arrayInvertido(int[] array) {
		int tam = array.length;
		for (int j=0; j < array.length; j++) {
			if(array[j] != array[tam]) {
				array[tam] = array[j];
				tam--;
			}
			System.out.println("hi");
		}
		for (int j=0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}
	public static void main(String[] args) {
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 2;
		}
		arrayInvertido(array);
	}
}
