package Ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
	
		
	while(!exit) {
		
		System.out.println("Introduce un primer número: \n");
		double num1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduzca un segundo número: \n");
		double num2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("*** Menu***\n");
		System.out.println("1.sumar\n");
		System.out.println("2.Restar\n");
		System.out.println("3.multiplicar\n");
		System.out.println("4.Dividir\n");
		System.out.println("0. Salir\n");
		
		System.out.println("¿que quieres hacer con el número?");
		int select = sc.nextInt();
	
		  switch (select) { 
          case 1:
              System.out.println("El resultado es: " + (num1 + num2));
              break;
          case 2:
              System.out.println("El resultado es: " + (num1 - num2));
              break;
          case 3:
              System.out.println("El resultado es: " + (num1 * num2));
              break;
          case 4:
              if (num2 == 0) { 
                  System.out.println("ERROR: DIVISIÓN IMPOSIBLE");
              } else {
                  System.out.println("El resultado es: " + (num1 / num2));
              }
              break;
          case 0:
              System.out.println("SALIENDO DEL PROGRAMA");
              exit = true; 
              break;
          default:
              System.out.println("Opción no válida. Intenta de nuevo.");
              break;
      }
		
	}
	sc.close();
	}


}
