package App;

import java.sql.SQLException;
import java.util.Scanner;

import modelo.Persona;
import prueba.PersonaService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el dni");
		String dni = scanner.nextLine();
		try {
 
			PersonaService service = new PersonaService();
			
			Persona persona1 = service .consultarPersona(dni);
 
			if (persona1 == null) {
				System.out.println("No existe persona con los datos solicitados");
			} else {
				System.out.println(persona1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Excepcion en main: " + e.getMessage());
		} finally {
			scanner.close();
		}
		
		
	}

}
