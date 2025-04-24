package App;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Service.PersonaService;
import modelo.Persona;



public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
			
		Persona p1 = new Persona ();
		PersonaService ps = new PersonaService();
		List<Persona> lista = new ArrayList<>();
		
		
		System.out.println(ps.buscarPersona("Pera"));
		
	}

}
