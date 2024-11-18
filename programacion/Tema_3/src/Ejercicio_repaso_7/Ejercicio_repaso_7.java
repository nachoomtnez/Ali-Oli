      package Ejercicio_repaso_7;
      import java.util.Scanner;

public class Ejercicio_repaso_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		int cont = 0;
		double precio = 0.0;
		int i = 0;
		String concatenar = "";
		
		String[] telegrama = new String[300];
		
		while(!exit) {
			System.out.println("Introduzca una palabra para añir al telegrama, si dice stop programa parara");
			String palabra = sc.nextLine();
			
			if(palabra.toUpperCase().equals("STOP")) {
				exit = true;
			}else {
				telegrama[i] = palabra;
				cont++;
				concatenar = concatenar + telegrama[i]+" ";
			}
			i++;
		}
		System.out.print(concatenar.toUpperCase());
		System.out.println();
		System.out.print("El precio es: "+(cont*0.24));
	}

}
