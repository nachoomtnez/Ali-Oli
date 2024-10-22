 package Ejercico19;
 import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double iva = 0;
		
		
		System.out.println("Introduce un precio para el producto");
		double precio = sc.nextDouble();
		sc.nextLine();
		
		
		
		System.out.println("¿que iva quieres aplicar?");
		System.out.println("1.normal");
		System.out.println("2.reducido");
		System.out.println("3.superreducido");
		System.out.println("4.sin iva");
		
		int ident = sc.nextInt();
		
		switch(ident){
		case 1:
			iva = 0.21;
			break;
		case 2: 
			iva = 0.10;
			break;
		case 3:
			iva = 0.04;
			break;
		case 4:
			iva = 0.00;
			break;
		default:
			System.out.println("ERROR");
		}
		double precio_total = precio +(precio * iva);
		System.out.println("El precio es "+precio+" y con el iva es "+precio_total);
	}

}
