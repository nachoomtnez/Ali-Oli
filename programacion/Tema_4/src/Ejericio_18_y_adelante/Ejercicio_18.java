package Ejericio_18_y_adelante;
import java.util.Scanner;



public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿cual es su dni?");
		String dni = sc.nextLine();
		
		System.out.println("¿como se llama el alumno?");
		String nombre = sc.nextLine();
		
		System.out.println("¿cual es la edad?");
		int edad = sc.nextInt();
		
		Alumno alumno1 = new Alumno(dni,nombre,edad);
		
		System.out.println("¿cual es la nota?");
		double nota = sc.nextDouble();
		
		System.out.println("¿a que curso pertenece?");
		int cursillo = sc.nextInt();

		
		
		
		System.out.println(alumno1);
	
	}

}
