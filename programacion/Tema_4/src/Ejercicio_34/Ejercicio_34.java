package Ejercicio_34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Ejercicio_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<String> listaCadenas = new ArrayList<>();
		
		
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Introduce cadena");
			String cadena = sc.nextLine();
			listaCadenas.add(cadena);
		}
		
		System.out.println("PAra imrprimir cadenas : "+listaCadenas);
		
		for(int i = 0; i < listaCadenas.size() ; i++) {
			listaCadenas.set(i,listaCadenas.get(i).toUpperCase());
		}
		
		System.out.println(listaCadenas);
		
		if(listaCadenas.contains("")) {
			System.out.println("Al menos hay una cadena vacia");
		}
		
		 Iterator<String> iterador = listaCadenas.iterator();
		 
	        while (iterador.hasNext()) {/*mientras que la lista tenga un elemento despues del que se esta mirando sigue*/	
	            String cadena = iterador.next();/*mira el siguiente elemento de la lista*/
	            if (cadena.length() < 6) {
	                iterador.remove(); // Elimina el elemento actual
	            }
	        }
		
		System.out.println(listaCadenas);
	}

}
