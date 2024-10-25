package Ejercicio_26;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
	
		String aleatorio = " ";
		String eleccion = " ";
		boolean exit = false;
		
		int maquina = 0;
		int humano = 0;
		int empate = 0;
	while(!exit) {
		Random ramdom = new Random();
		
		int numeroAleatorio = ramdom.nextInt(1,3);
		
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
		sc.nextLine();
		
		if(     (eleccion.equals("PIEDRA") && aleatorio.equals("TIJERAS")) ||
	            (eleccion.equals("TIJERAS") && aleatorio.equals("PAPEL")) ||
	            (eleccion.equals("PAPEL") && aleatorio.equals("PIEDRA"))){
				humano++;
			 System.out.println("¡Ganaste!");
        } else if (eleccion.equals(aleatorio)) {
            System.out.println("¡Es un empate!");
            empate++;
        } else {
            System.out.println("Perdiste. ¡Inténtalo de nuevo!");
            maquina++;
        }
		
		System.out.println("¿Quieres jugar otra vez?");
		String pregunta = sc.nextLine().toUpperCase();
		
		if(pregunta.equalsIgnoreCase("NO")) {
			
			System.out.println("EL marcador es: humano "+humano+", maquina "+maquina+", empate "+empate);
			exit = true;
		}
	}
	}
}
