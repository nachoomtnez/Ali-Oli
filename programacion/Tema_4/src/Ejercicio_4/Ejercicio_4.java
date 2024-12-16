package Ejercicio_4;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdzuca una frase");
		String frase = sc.nextLine();
		
		System.out.println("¿Que quieres hacer?(1 mayusculas, 2 minusculas)");
		String ident = sc.nextLine();
		
		
		
		if(ident.equals("1")) {
			String solucion = Ejercicio_1.Ejercicio_1.getMayusculas(frase);
		}else if(ident.equals("2")) {
			String solucion = ejercicio2.ejercicio2.getMinusculas(frase);
		}else {
			String solucion = "cadena erronea";
		}
	}

}
