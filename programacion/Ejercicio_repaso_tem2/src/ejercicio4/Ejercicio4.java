package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ident = 0;
		
	while(ident != 4)	{	
		System.out.println("\t MENU ");
		System.out.println("1. Abrir");
		System.out.println("2. Guardar");
		System.out.println("3. Modificarr");
		System.out.println("4. Salir");
		
		System.out.println("Introduzca que tiene que hacer: ");
		 ident = sc.nextInt();
		
				switch(ident){
				case 1 : 
					System.out.println("Abriendo");
					break;
					
				case 2 : 
					System.out.println("Guardando");
					break;
				
				case 3: 
					System.out.println("Modificando");
					break;
				
				case 4: 
					System.out.println("Saliendo");
					break;
				
				default:
					System.out.println("Introduzca una opcón valida");
					break;
				
			}
		}
			
	}
	
}
	

