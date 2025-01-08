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
				 resul = resta(numero1,numero2);
				 enc = true;
			}else if(cad.equals("MUL")){
				 resul = mul(numero1,numero2);
				 enc = true;
			}else if(cad.equals("DIV")) {
				 resul = div(numero1,numero2);
				 enc = true;
			}else {
				System.out.println("ERROR.REINICIANDO");
			}
		}
		
			
	}
	
	public static int resta(int num1, int num2) {
		
		int resul1 = num1-num2;
		
		return resul1;
	}
	public static int mul(int num1, int num2) {
		
		int resul2 = num1*num2;
		
		return resul2;
	}
	public static int div(int num1, int num2) {
		
		int resul3 = num1/num2;
		
		return resul3;
	}
}
