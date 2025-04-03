package Ejercicio_3;
import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        SacoNumero saco = new SacoNumero(null);

	        // Añadir números al saco
	        saco.addNumero(10);
	        saco.addNumero(20);
	        saco.addNumero(30);
	        saco.addNumero(40);

	        System.out.println("Números en el saco: " + saco);

	        while (true) {
	            System.out.print("Introduce la posición del número que quieres ver (o -1 para salir): ");
	            try {
	                int posicion = scanner.nextInt();

	                if (posicion == -1) {
	                    break;
	                }

	                Integer numero = saco.getNumero(posicion);
	                if (numero != null) {
	                    System.out.println("Número en la posición " + posicion + ": " + numero);
	                } else {
	                    System.out.println("Posición no válida.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Error: No puedes introducir letras. Por favor, introduce un número.");
	                scanner.nextLine(); // Consumir el salto de línea
	            }
	        }

	        scanner.close();
	}

}
