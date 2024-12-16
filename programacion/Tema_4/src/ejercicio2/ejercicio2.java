package ejercicio2;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce una cadena en mayusculas");
		String frase = sc.nextLine();
		sc.close();
		
		String resultado = getMinusculas(frase);
		
		System.out.println(resultado);
		

	}
	
	public static String getMinusculas(String cadena) {
		return cadena.trim().toLowerCase();
	}

}
