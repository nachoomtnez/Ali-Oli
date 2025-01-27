package Ejericio_35_y_36;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;





public class Ejercicio_35_y_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Alumno> alumnos = new ArrayList<>();
		
		
		Curso curso = new Curso(1,"DAM-DAW", alumnos);
		
		Alumno alumno1 = new Alumno("12345678a","julio",14,curso,3.0);
		
		Alumno alumno2 = new Alumno("12345678a","raul",14,curso,4.0);
		
		Alumno alumno3 = new Alumno("34567891c","marco",15,curso,5.0);
		
				
		alumnos.add(alumno1);
		
		alumnos.add(alumno2);
		
		alumnos.add(alumno3);
		
		for(int i = 0; i < alumnos.size(); i++) {
			for(int j = i+1 ; j < alumnos.size(); j++) {
				if(alumnos.get(i).equals(alumnos.get(j))){
					System.out.println("Alumno repetido");
				}
			}
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
