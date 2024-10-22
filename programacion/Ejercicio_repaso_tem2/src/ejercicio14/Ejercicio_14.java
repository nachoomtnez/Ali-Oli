 package ejercicio14;
import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		String pasword = "";
		
		
		while(!exit) {
			System.out.println("Introduce una contraseña: \n");
			 pasword = sc.nextLine();
			
			
			if(pasword.length() > 8) {
				exit = true;
				
			}else {
				System.out.println("ERROR INTRODUZCA OTRA CONTRASEÑA");
			}
			
		}
		String aux = pasword.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o","0").replaceAll("t", "7");
		System.out.println("la contraseña es : "+aux);
		
		sc.close();
	}

}
