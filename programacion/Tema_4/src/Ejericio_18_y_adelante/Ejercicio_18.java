package Ejericio_18_y_adelante;
import java.util.Scanner;



public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno1 = new Alumno("");
		
		System.out.println("¿cual es su dni?");
		String dni = sc.nextLine();
		
		alumno1.setDni(dni);
		
		System.out.println("¿como se llama el alumno?");
		String nombre = sc.nextLine();
		
		alumno1.setNombre(nombre);
		
		System.out.println("¿cual es la edad?");
		int edad = sc.nextInt();
		
		alumno1.setEdad(edad);
		
		System.out.println("¿cual es la nota?");
		double nota = sc.nextDouble();
		
		alumno1.aprobar(nota);
		
		System.out.println(alumno1);
	
	}

}
