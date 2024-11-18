package Ejercicio_repaso_10;
import java.util.Scanner;

public class Ejercicio_repaso_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantos alumnos quieres añadir?");
		int alumn = sc.nextInt();
		
		float media = 0;
		float mediaT = 0;
		int cont = 0;
		float aux = 0;
		
		String[] nombreAlu = new String[alumn];
		
		float[] notaMedia = new float[alumn*3];
		
		
		for(int i = 0; i < alumn ; i++) {
			
			
			
			System.out.println("¿cual es el nombre del alumno"+(i+1)+" ?");
			String nombre = sc.nextLine();
			
			nombreAlu[i] = nombre;
			for(int j = 0; j < 3; j++){
				System.out.println("¿Cual es la nota del examen"+(j+1)+"?");
				int nota = sc.nextInt();
				
				media = media + nota;
				
				
			}
			mediaT = media/3;
			
			notaMedia[i] = mediaT;
		}
		
		System.out.println("Listado de notas: ");
		
		for(int i = 0; i < alumn; i++){
			System.out.println("Alumno: "+nombreAlu[i]);
		}
		for(int i = 0; i < alumn; i++) {
			aux = aux + notaMedia[i];
		}
		
		System.out.println("La media de los alumnos es: "+aux);
	}

}
