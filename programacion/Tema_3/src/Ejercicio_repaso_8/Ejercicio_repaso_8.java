package Ejercicio_repaso_8;
import java.util.Scanner;

public class Ejercicio_repaso_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la direccion html");
		String html = sc.nextLine();
		
		String concatena = " ";
		
		String[] vec = html.split("");
		
		boolean exit = false;
	
		
		for(int i = 0 ; i < vec.length; i++) {
			
			if(vec[i].equals("<")) {
				exit = true;
			}else if (vec[i].equals(">")) {
				exit = false;
			}else if(exit == false) {
				 concatena = concatena + vec[i];
			}
		}
		System.out.print(concatena);
		
	}

}
