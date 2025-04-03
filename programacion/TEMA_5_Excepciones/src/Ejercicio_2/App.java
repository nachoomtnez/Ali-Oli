package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numero = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		boolean exit = false;
		
		while(!exit) {
			try {
				System.out.println("Introduce un numero a la lista");
				Integer num = sc.nextInt();
				
				if(num == -1) {
					exit = true;
				}else {
					numero.add(num);
				}
			}catch(Exception e){
				System.out.println("Introduce un valor valido");
				sc.nextLine();
			}
		}
		
		
		System.out.println(numero);
		sc.close();
		
	}

}
