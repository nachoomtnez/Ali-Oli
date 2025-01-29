package Ejercicio_38;

import Ejercicio_37.ColaCadenas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PilaCadenas pila = new PilaCadenas();
	        System.out.println(pila);

	   
	        pila.añadirCadena("primero");
	        
	        pila.añadirCadena("segundo");
	        
	        System.out.println(pila);
	        
	        pila.añadirCadena("tercero");
	        
	        System.out.println(pila);
	        
	        String elemento = "";
	        
	        while(pila.getTamaño() > 0) {
	        	elemento = pila.sacarCadena();
	        	System.out.println(elemento);
	        }
	        
	        pila.añadirCadena("cuarto");
	        System.out.println(pila);
	}

}
