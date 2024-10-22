package Ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una pagina web: ");
		String pag = sc.nextLine();
		
		int bsq1 = pag.indexOf("://");
		
		if(bsq1 == -1) {
			System.out.println("ERROR:CERRANDO PROGRAMA");
			
		}else {
		
		String comando = pag.substring(0,bsq1+3);
		String resto = pag.substring(bsq1+3);
		
		
		
		int busq2 = resto.indexOf(".");
		
		String parte1 = resto.substring(0,busq2);
		
		String resto2 = resto.substring(busq2+1);
		
		int bsq3 = resto2.indexOf(".");
		
		String parte2 = resto2.substring(0,bsq3);
		
		String resto3 = resto2.substring(bsq3+1);
		
	
		
		System.out.println(comando+"\n"+parte1+"\n"+parte2+"\n"+resto3);
		
		sc.close();
		}
	}
}
