package EJERCICIO1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿En que año has nacido?");
		int año = sc.nextInt();
		sc.close();  
		
		if(año>=1883 && año<=1900) {
			System.out.println("Pertenes a la generacion perdidia");
		}
		else if(año>=1901 && año<=1927 ) {
			System.out.println("Pertenes a la generacion pgrandiosa");
		}
		else if(año>=1928 && año<=1945) {
			System.out.println("Pertenes a la generacion silenciosa");
		}
		else if(año>=1946 && año<=1964) {
			System.out.println("Pertenes a los babu boomers");
		}
		else if(año>=1965 && año<=1980) {
			System.out.println("Pertenes a la generacion X");
		}
		else if(año>=1981 && año<=1996) {
			System.out.println("Pertenes a la generacion Y");
		}
		else if(año>=1997 && año<=2012) {
			System.out.println("Pertenes a la generacion Z");
		}
	}

}
