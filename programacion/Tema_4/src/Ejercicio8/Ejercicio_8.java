package Ejercicio8;

import java.util.Scanner;

public class Ejercicio_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		
		
		int resul = 0;
		boolean enc = false;
		
		while(!enc) {
			System.out.println("Introduce un primer numero");
			int numero1 = sc.nextInt();

			System.out.println("Introduce un segundo numero");
			int numero2 = sc.nextInt();
			
			System.out.println("Introduce un identificador para el funcionamiento: ");
			String cad = sc.nextLine();
			
			if(cad.equals("ADD")) {
				resul = Ejercicio5.Ejercicio_5.suma(numero1,numero2);
				enc = true;
			}else if(cad.equals("SUB")) {
				 resul = Ejercicio_7.Calculadora.resta(numero1,numero2);
				 enc = true;
			}else if(cad.equals("MUL")){
				 resul = Ejercicio_7.Calculadora.mul(numero1,numero2);
				 enc = true;
			}else if(cad.equals("DIV")) {
				 resul = Ejercicio_7.Calculadora.div(numero1,numero2);
				 enc = true;
			}else {
				System.out.println("ERROR.REINICIANDO");
			}
		}
		System.out.println(resul);
			
	}
	
	
}
