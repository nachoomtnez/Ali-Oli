package Ejercicio3_avanzado;

public class Ejercicio3_avanzado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 9; j++) {
				if(j%i == 0) {
					System.out.print(j);
				}
			}
		
			System.out.println();
		}
	}

}
