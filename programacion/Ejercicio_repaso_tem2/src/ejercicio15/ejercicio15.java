package ejercicio15;
import java.util.Random;
import java.util.Scanner;


public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 10;
		
		Random ramdom = new Random();
		int numeroAleatorio = ramdom.nextInt(10);
		
		boolean enc = false;
		
		while(!enc) {
			System.out.println("Introduce un numero para ver si has acertado: \n");
			int num = sc.nextInt();
			
			if(num != numeroAleatorio) {
				System.out.println("Te has equivocado prueba de nuevo \n");
				cont --;
			}else {
				System.out.println("Has encontrado el numero en "+cont+" intentos.");
				enc= true;
			}
		}
	}

}
