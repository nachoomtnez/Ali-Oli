package Ejercicio_19;
import java.util.Scanner;
import java.util.Random;

public class Ejercico_19 {
	public static void main(String[] args) {
		String[] palabra = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla",
				"molinero", "sofisticado", "terremoto", "culinario", "teclado", "primavera"};
		
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt(10);
		String palabraAleatoria = palabra[numeroAleatorio];
		String [] recorrido = new String[palabraAleatoria.length()];
		
		
		for(int i = 0; i < palabraAleatoria.length(); i++) {
			recorrido[i] = ("_ ");
		}
		
		System.out.println();
		
		
		boolean exit = false;
		
		String[] palabraRec = palabraAleatoria.split("");
		
		while(!exit) {
			System.out.println();
			System.out.println("Introduce una letra");
			String letra = sc.nextLine().toLowerCase();
			
			boolean enc = false;
			
			for(int i = 0; i < palabraRec.length; i++) {
					
				if(letra.equals(palabraRec[i])) {
					recorrido[i] = letra;
					enc = true;
					
				}
				
			
			}
			
			for(int j = 0; j < recorrido.length; j++) {
				 System.out.print(recorrido[j] + " ");    
			}
		
			System.out.println();
			
			
			
			 exit = true;  
	            for (int i = 0; i < recorrido.length; i++) {
	                if (recorrido[i].equals("_ ")) {
	                    exit = false;  
	                    break;  
	                }
	            }
		
		
		
	}
	
			System.out.println("Has acetado, la palabra es "+palabraAleatoria);
		
		sc.close();
	}
}