package Ejercicio_3;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
	
		
		System.out.println("Introduce que quieres hacer 1(poner en mayusculas) o 2 (poner en minuscula)");
		String numero = sc.nextLine();
		sc.close();
		
		
		String resultado = getMayMin(frase,numero);
		
		System.out.println(resultado);
		
		
	}

	public static String getMayMin(String cadena, String ident) {
		if(ident.equals("1")) {
			return cadena.trim().toUpperCase();
		}else if(ident.equals("2")) {
			return cadena.trim().toLowerCase();
		}else {
			return "opcion invalida";
		}
	}
}
