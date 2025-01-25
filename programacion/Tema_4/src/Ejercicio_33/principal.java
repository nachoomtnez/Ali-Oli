package Ejercicio_33;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Semaforo semaforo = new Semaforo();
		
		System.out.println(semaforo);
		
		semaforo.setColor("azul");
		System.out.println(semaforo);
		
		semaforo.setColor("verde");
		System.out.println(semaforo);
		
		semaforo.setParpadeando(true);
		semaforo.setColor("ambar");
		System.out.println(semaforo);
		
		for(int i = 0; i < 5; i++) {
			semaforo.cambiarEstado();
			System.out.println(semaforo);
		}
	}

}
