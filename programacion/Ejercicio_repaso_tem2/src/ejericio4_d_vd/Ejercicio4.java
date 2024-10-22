package ejericio4_d_vd;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el precio: ");
		double precio = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduce la cantidad de productos");
		double cant = sc.nextDouble();
		
		int porcentaje;
		
		double precio_total = cant*precio;
		if(cant > 100) {
			porcentaje = 40; 
		}else if(cant>=25 && cant<=100) {
			porcentaje = 20; 
		}else if(cant >=10 && cant<=24) {
			porcentaje = 10;	
		}else {
			
		porcentaje = 0;
			
		}
		System.out.println("Subtotal = "+cant+" x "+precio+" = "+(cant*precio)+" euros");
		System.out.println("Descuento = "+porcentaje+ "% de "+precio_total+" = "+(precio_total*(porcentaje/100))+"euros");
		System.out.println("Total = "+precio_total+" - "+(precio_total*(porcentaje/100))+"euros");
	}

}
