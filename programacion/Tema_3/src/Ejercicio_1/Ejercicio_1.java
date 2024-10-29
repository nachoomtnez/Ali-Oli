package Ejercicio_1;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[30];
		int indice = 0;
		
		for(int i = 2 ; i <num.length; i+=2) {
		num[indice] = i;
		indice++;
		}
		
		for(int i = 0;i < indice; i++) {
			System.out.println(num[i]);
		}
	}

}
