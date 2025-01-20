package Ejericio_18_y_adelante;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;



public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Alumno[] alumnos = new Alumno[3];
		
		Curso curso = new Curso(1,"DAM-DAW");
		
		Alumno alumno1 = new Alumno("12345678a","julio",14,curso,3.0);
		
		Alumno alumno2 = new Alumno("12345678a","raul",14,curso,4.0);
		
		Alumno alumno3 = new Alumno("34567891c","marco",15,curso,5.0);
		
				
		alumnos[0] = alumno1;
		
		alumnos[1] = alumno2;
		
		alumnos[2] = alumno3;
		
		
		
		if(alumnos[0].equals(alumnos[1])) {
			System.out.println("ERROR:DNI IGUALES");
		}
		if(alumnos[0].equals(alumnos[2])) {
			System.out.println("ERROR:DNI IGUALES");
		}
		if(alumnos[1].equals(alumnos[2])) {
			System.out.println("ERROR:DNI IGUALES");
		}
			
		
		
		
		System.out.println("Nombre del profesor");
		String nombreP = sc.nextLine();
		
		System.out.println("Introduce la edad");
		int edadP = sc.nextInt();
		
		Profesor p = new Profesor(nombreP,edadP);
		
		
		System.out.println(alumno1);
		System.out.println(p);
		
		
	}

}
