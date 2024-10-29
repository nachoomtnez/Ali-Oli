package Ejercicio4_avanzado;
import java.util.Scanner;

public class Ejercicio4_avanzado {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		String num = sc.nextLine();
		
		String numInvert = "";
		
		for(int i = num.length()-1; i >= 0; i--) {
			numInvert += num.substring(i,i+1);
		}
		
		if(num.equals(numInvert)) {
			System.out.println("NUMERO CAPICUA");
		}else {
			System.out.println("NUmero no capicua");		}
	
		
	}
}
