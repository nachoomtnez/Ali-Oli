package Ejercicio_repaso_9;
import java.util.Scanner;

public class Ejercicio_repaso_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una dirección de html: ");
		String html = sc.nextLine();
		
		String[] vector = html.split("");
		boolean pausa = false;
		String concatena = " ";
		
		
		for(int i = 0; i < vector.length; i++) {
			if(vector[i].equals(">") && vector[i+1].equals("<") && (i+1) < vector.length){
				pausa = true;
			}else if (vector[i].equals(">") && i + 1 >= vector.length && !vector[i+1].equals("<")) {
				pausa = false;
			}else if( pausa == false) {
				concatena = concatena+ vector[i];
			}
		}
		
		String[] vector2 = concatena.split("");
		
		for(int i = 0; i < vector2.length; i++) {
			
			if(vector2[i].equals(" ")) {
				System.out.println();
			}else {
				System.out.print(vector2[i]);
			}
		}
	}

}
