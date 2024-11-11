package Ejercicio_16;
import java.util.Scanner;

public class Ejercicio_16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce una palabra o frase");
		String frase = sc.nextLine();
		
		String[] frases = frase.split("");
		
		String [] frases2 = frase.split(" ");
		
		int cont = 0;
		int cont1 = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frases[i].equalsIgnoreCase("a")) {
				cont++;
			}
			
		}
		for (int i = 0; i < frases2.length;i++) {
			cont1++;
		}
		System.out.println("Contador a: "+cont+" Contador palabras : "+cont1);
		
		
		
	}
}
