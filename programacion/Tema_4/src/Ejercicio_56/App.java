package Ejercicio_56;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> mapa = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		Integer numero = 0;
		
		while(!exit) {
			
			System.out.println("Introduce un numero");
			numero = sc.nextInt();
			
			if(numero == 0) {
				exit = true;
			}else {
				mapa.put(numero, mapa.getOrDefault(numero, 0) + 1);
			}
		}
		
		System.out.println("Distribucion: ");
		Set<Entry<Integer,Integer>> pares = mapa.entrySet();
		
		for(Entry<Integer,Integer> par : pares) {
			System.out.println(">Numero "+par.getKey()+" : "+par.getValue()+" veces");
		}
		
	}

}
