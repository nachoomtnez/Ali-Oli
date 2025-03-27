package Ejercicio_57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<String> palabra = new ArrayList<>();
		String palabras;
		
		String letra;
		String primeraLetra = "";
		
		Map <String, List<String>> mapa = new HashMap<>();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("INtroduce una palabra(pon fin para salir)");
			palabras = sc.nextLine();
			
			if(palabras.equalsIgnoreCase("fin")) {
				exit = true;
			}else{
				palabra.add(palabras);
				primeraLetra = palabras.substring(0,1).toUpperCase();
				
				
			}
			
			
			if(mapa.containsKey(primeraLetra)) {
				mapa.get(primeraLetra).add(palabras);
			}else {
				mapa.put(primeraLetra, new ArrayList<String>());
				mapa.get(primeraLetra).add(palabras);
			}
		}
		
		
		
		boolean exit2 = false;
		
		while(!exit2) {
			System.out.println("Introduce una letra para ver si empieza o no(si pones fin acaba el programa)");
			letra = sc.nextLine();
			
			if(letra.equalsIgnoreCase("fin")) {
				exit2 = true;
			}else {

				if(mapa.containsKey(letra)) {
					
					System.out.println("Las palabras que empiezan por "+letra+" son: ");
					
					for(String palabr : mapa.get(letra)) {
						
						if(palabr.startsWith(letra)) {
							System.out.println("\t> "+palabr);
						}
				
					}
				}else {
					System.out.println("No hay palabras que empiecen por la letra: "+letra);
				}
			}
		}
		
	
	
		
	}

}
