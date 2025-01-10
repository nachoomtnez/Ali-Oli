package Ejercicio_10;

import java.util.Scanner;
public class Ejericio_10 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("¿Cuantas componentes quiere en el vector?");
			int cont = sc.nextInt();
			sc.nextLine();
			
			String[] vector = new String[cont];
			
			for(int i = 0; i < cont; i++) {
				System.out.println("¿Que palabra quieres meter?");
				vector[i] = vector[i];
			}
			
			System.out.println("¿Que palabra quieres?");
			String palabra = sc.nextLine();
			sc.close();
			
		   Ejercicio_9.ArrayUtils.buscarPalabra(vector, cont, palabra);
		}
		
		
	}

