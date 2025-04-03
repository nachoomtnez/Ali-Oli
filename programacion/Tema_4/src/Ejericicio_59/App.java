package Ejericicio_59;

public class App {

	public static void main(String[] args) {
		
			Geografia geografia = new Geografia();
		
			geografia.agregarPais("Egipto", "El Cairo");
	        geografia.agregarPais("Suiza", "Berna");
	        geografia.agregarPais("Austria", "Praga");
	        geografia.agregarPais("Hungría", "Budapest");
	        geografia.agregarPais("Austria", "Viena");

	      
	        geografia.imprimirPaises();

	      
	        double promedioLongitud = geografia.calcularLongitudMediaPaises();
	        System.out.println("Promedio de longitud de los nombres de los países: " + promedioLongitud);

	        
	        System.out.println("\nIntroduce una letra para buscar países con capital que empiece por esa letra:");
	        char letra = 'B';
	       // geografia.imprimirNUmeroPaisesLetra(letra);

	  
	        System.out.println("\nPaíses y capitales que comienzan por la misma letra:");
	        geografia.mismaLetra();


	        System.out.println("\nEliminar primer país cuya capital empiece con " + letra + ":");
	        //geografia.eliminarPaisConCapitalLetra(letra);

	 
	        System.out.println("\nNúmero de países con capitales que comienzan con " + letra + ":");
	       // int numeroPaises = geografia.numeroPaisConCapitalLetra(letra);
	        //System.out.println("Número de países: " + numeroPaises);
	}

}
