package Ejercicio_21;


public class Ejercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][] = new int[10][10];
		
		for(int i = 0; i < 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				
				int aux = i * j;
				
				System.out.print(aux+" ");
			}
			System.out.println();
		}
	}

}
