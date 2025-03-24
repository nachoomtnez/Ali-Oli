package Ejercicio_55;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evaluacion eval = new Evaluacion();
		
		eval.addNota("123456789",new BigDecimal("4.5"));
		eval.addNota("23456789",new BigDecimal("5.5"));
		eval.addNota("3456789",new BigDecimal("7.5"));
		eval.addNota("456789",new BigDecimal("2.5"));
		eval.addNota("56789",new BigDecimal("1.5"));
		
		System.out.println(eval.toString());
		
		eval.addNota("123456789",new BigDecimal("4.5"));
		System.out.println(eval.toString());
		
		   eval.corregirNota("123456789", new BigDecimal("6.0"));
	        eval.corregirNota("0000000X", new BigDecimal("7.0"));
	        System.out.println("Evaluación después de corregir notas:");
	        System.out.println(eval.toString());
	        
	       
	    	System.out.println( eval.obtenerCantidadAprobados());
	    	
	        System.out.println(eval.obtenerSuspensos());
	        
	        eval.borrarAprobados();
	        System.out.println("suspensos");	        
	        System.out.println(eval.toString());
	}

}
