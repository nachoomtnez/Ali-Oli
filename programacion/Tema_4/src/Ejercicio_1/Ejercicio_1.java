package Ejercicio_1;


public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cad1 = " Hola buenas tardes ";
		
		String resultado  = getMayusculas(cad1);	
		System.out.println(resultado);

	}



public static String getMayusculas(String cadena){
	
	return cadena.trim().toUpperCase();
	
}
}