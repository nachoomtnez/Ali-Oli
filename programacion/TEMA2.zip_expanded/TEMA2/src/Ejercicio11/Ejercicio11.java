package Ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean cmp = false;
		
		while(cmp == false) {
			System.out.println("Introduce un correo arfavo: ");
			String correo = sc.nextLine();
			
			int search = correo.indexOf('@');
			int search2 = correo.indexOf('.',search);

			boolean termina = true;
			
			if(correo.endsWith(".")) {
				termina = false;
			}
			if(search != -1 && search2 != -1 && search2 > search+1 && termina == true) {
				System.out.println("Correo esta bien");
				cmp = true;
			}
		}
		
	}

}
