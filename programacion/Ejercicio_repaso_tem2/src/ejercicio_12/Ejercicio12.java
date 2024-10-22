package ejercicio_12;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        

	        System.out.print("Introduce el tamaño del tablero (N mayor que 0): ");
	        int n = sc.nextInt();
	        
	
	        if (n <= 0) {
	            System.out.println("ERROR: Debe ser un número mayor que cero.");
	            sc.close();
	            return;
	        }

	 
	        System.out.println("Tablero de " + n + "x" + n + ":");
	        for (int i = 0; i < n; i++) {
	        
	            System.out.print("|");
	            for (int j = 0; j < n; j++) {
	                System.out.print("__|");
	            }
	            System.out.println(); 
	        }
	        
	        
	        System.out.print("|");
	        for (int j = 0; j < n; j++) {
	            System.out.print("__|");
	        }
	        System.out.println();

	        sc.close(); 
	    }
	}


