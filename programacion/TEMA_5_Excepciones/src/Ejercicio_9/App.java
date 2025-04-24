package Ejercicio_9;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona();
		
		try {
			
			persona1.setGenero("h");
			persona1.setAltura(new BigDecimal("1.75"));
			System.out.println("Persona 1: "+persona1);
			
			Persona persona2 = new Persona();
            persona2.setGenero("m");
            persona2.setAltura(new BigDecimal("1.65"));
            System.out.println("Datos de la persona 2: " + persona2);
            
            Persona persona3 = new Persona();
            persona3.setGenero("m");
            persona3.setAltura(new BigDecimal("2.65"));
            System.out.println("Datos de la persona 3: " + persona3);
            
            
		} catch (ParametroIncorrectoException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
