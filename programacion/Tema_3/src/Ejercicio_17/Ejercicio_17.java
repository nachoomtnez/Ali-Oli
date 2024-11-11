package Ejercicio_17;

public class Ejercicio_17 {
	public static void main(String[] args) {
		
		double[] vec = new double[]{5.4,3.1,9.0,4.7};
		
		System.out.print("El vector es: ");
		
		for(double imp : vec) {
			System.out.print(imp+" ");
			
		}
		System.out.println();
		double aux = 0 ;
		
		for(double imp : vec) {
			aux = aux + imp;
		}
		System.out.println("La suma es: "+aux);
	}
}
