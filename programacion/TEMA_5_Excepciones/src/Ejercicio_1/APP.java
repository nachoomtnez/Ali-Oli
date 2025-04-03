package Ejercicio_1;
import java.util.*;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numero = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		boolean exit = false;
		
		try {
			while(!exit) {
				
				System.out.println("Introduce un numero a la lista");
				Integer num = sc.nextInt();
				
				if(num == -1) {
					exit = true;
				}else {
					numero.add(num);
				}
			}
		}finally {
			System.out.println(numero);
			sc.close();
		}
		
		
	}

}
