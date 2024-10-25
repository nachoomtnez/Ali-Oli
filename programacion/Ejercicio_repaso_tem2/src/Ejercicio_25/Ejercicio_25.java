package Ejercicio_25;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Random ramdom = new Random();
		int numeroAleatorio = ramdom.nextInt(1,3);
		String aleatorio = " ";
		String eleccion = " ";
		
		switch(numeroAleatorio) {
		case 1 :
			 aleatorio = "PAPEL";
			break;
		case 2 : 
			 aleatorio = "TIJERAS";
			 break; 
		case 3 :
			aleatorio = "PIEDRA";
			break;
		}
		
		System.out.println("Introduce que quieres sacar: ");
		eleccion = sc.nextLine().toUpperCase();
		
		if(eleccion.equals("PIEDRA") && aleatorio.equals("TIJERAS") ||
	            eleccion.equals("TIJERAS") && aleatorio.equals("PAPEL") ||
	            eleccion.equals("PAPEL") && aleatorio.equals("PIEDRA")){
				
			 System.out.println("¡Ganaste!");
        } else if (eleccion.equals(aleatorio)) {
            System.out.println("¡Es un empate!");
        } else {
            System.out.println("Perdiste. ¡Inténtalo de nuevo!");
        }
		}
		
		
	}


