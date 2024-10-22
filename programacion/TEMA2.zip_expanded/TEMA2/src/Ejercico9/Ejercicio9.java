 package Ejercico9;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Introduce nombre completo");
		String nombreCompleto = sc.nextLine();
		sc.close();
		
		
		int primerEspacio = nombreCompleto.indexOf(' ');
		
		if(primerEspacio == -1) {
			System.out.println("PON BIEN EL APELLIDO");
		}
		
		String nombre = nombreCompleto.substring(0,primerEspacio);
		
		String resto = nombreCompleto.substring(primerEspacio+1);
		
		int segundoEspacio = resto.indexOf(' ');
		
		if(segundoEspacio == -1) {
			System.out.println(" pon bien el nombre");
			
		}
		String primerApellido = resto.substring(0, segundoEspacio);
		
		String segundoApellido = resto.substring(0, segundoEspacio+1);
		
		System.out.println("NOmbre: "+nombre);
		System.out.println("Apellido: "+primerApellido);
		System.out.println("Apellido 2: "+segundoApellido);
	}

}
