package ejercicio_20;

public class Ejercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j <i; j++) {
				if(i == j) {
					System.out.print("* ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
		
	}

}
