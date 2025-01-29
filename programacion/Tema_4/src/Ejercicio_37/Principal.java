package Ejercicio_37;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ColaCadenas cola = new ColaCadenas();
	        System.out.println(cola);

	   
	        cola.añadirCadena("primero");
	        
	        cola.añadirCadena("segundo");
	        
	        System.out.println(cola);
	        
	        cola.añadirCadena("tercero");
	        
	        String elemento = "";
	        
	        while(cola.getTamaño() > 0) {
	        	elemento = cola.sacarCadena();
	        	System.out.println(elemento);
	        }
	        
	        System.out.println(cola);
	        
	        cola.añadirCadena("cuarto");
	}

}
