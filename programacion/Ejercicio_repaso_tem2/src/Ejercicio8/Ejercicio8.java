package Ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		
		boolean exit = false;
		
		while(exit == false) {
			
			System.out.println("introduce un  mensaje");
			String msj = sc.nextLine();
			
			
			
			if(msj.startsWith("hola") && msj.endsWith("hastaluego")) {
				String resto = msj.substring(4,msj.length() - 10).trim();
				
				System.out.println("Lo he entendido. Mensaje: "+resto);
			}else if(msj.startsWith("hola") && msj.endsWith("adiós")) {
				exit = true;
			}else {
				System.out.println("No he entendido el mensaje,repitelo");;
			}
		}
		sc.close();
	}

}
