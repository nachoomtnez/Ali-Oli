package Ejercicio_15;
import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce un numero para ver si es capicua o no");
			String  numero = sc.nextLine();
			
			String  [] vector =numero.split("") ;
			
			boolean esCapicua = true;
			
			int inicio = 0;
			int fin = vector.length - 1;
			
			while(inicio < fin) {
				if(!vector[inicio].equals(vector[fin])) {
					esCapicua = false;
				}
				inicio++;
				fin--;
			}
			
			if(esCapicua) {
				System.out.println(" es capicua ");
			}else {
				System.out.println("no es capicua");
			}
			
		
	}

}
