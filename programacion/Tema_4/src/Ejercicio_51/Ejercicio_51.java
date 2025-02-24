package Ejercicio_51;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<BigDecimal>numeros = new ArrayList<>();
		
		
		while(numeros.size()<5) {
			
			System.out.println("Dame un numero");
			BigDecimal num = sc.nextBigDecimal();
			
			if(!numeros.isEmpty()) {
				
				BigDecimal ultimo = numeros.get(numeros.size()-1);
			}
			if(num.compareTo(ultimo)>0) {
				numeros.add(num);
			}
			else {
				System.out.println("No es mayor que eñ anterior");
			}
		}
	}

}
