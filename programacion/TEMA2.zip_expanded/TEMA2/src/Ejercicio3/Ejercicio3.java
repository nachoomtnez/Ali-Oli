package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String cad1 = "Normal";
		String cad2 = "Reducido";
		String cad3 = "Superreducido";
		String cad4 = "Exento";
		
		System.out.println("¿Cual es el precio sin IVA?");
		double precio = sc.nextDouble();
		sc.nextLine();
	

		
		System.out.println("Opciones\n");
		System.out.println("Normal(21%)\n");
		System.out.println("Reducido(10%)\n");
		System.out.println("Superreducido(4%)\n");
		System.out.println("Exento(%0)\n");
		
		System.out.println("¿que tipo d iva tienes?");
		String cad = sc.nextLine();
		sc.close();
		
		if(cad.equalsIgnoreCase(cad1)) {
			double precio_iva = precio+(precio*0.21);
			System.out.println("El precio es: "+precio_iva);
		}else if(cad.equalsIgnoreCase(cad2)) {
			double precio_iva = precio+(precio*0.10);
			System.out.println("El precio es: "+precio_iva);
		}else if(cad.equalsIgnoreCase(cad3)) {
			double precio_iva = precio+(precio*0.04);
			System.out.println("El precio es: "+precio_iva);
		}else if(cad.equalsIgnoreCase(cad4)) {
			double precio_iva = precio;
			System.out.println("El precio es: "+precio_iva);
		}
		
	}

}
