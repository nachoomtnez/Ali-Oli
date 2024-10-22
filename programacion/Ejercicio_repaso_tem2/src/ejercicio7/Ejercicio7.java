package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
	
		int suma = 0;
		int cont = 0;
		
		boolean exit = false;
		
		while(!exit) {
		
			System.out.println("\n Introduce un numero: ");
			int num = sc.nextInt();
			suma = 0;
			cont = 0;
			
			if(num <0 || num>10) {
				System.out.println("Introduce un numero correcto \n");
			}else if(num == 0){
				exit = true;
			}else{
				for(int i = 1; i<=10; i++) {
					suma = suma+num;
					
					
					System.out.print(suma+" + ");
					cont = cont + suma;
					
					
				}
				System.out.print(" = "+cont);
			}

			}
		
			}
			
		}
	


