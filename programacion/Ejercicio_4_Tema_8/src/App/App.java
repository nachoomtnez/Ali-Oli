package App;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Service.PersonaService;
import modelo.Persona;



public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
			
		Persona p1 = new Persona ();
		
		//creamos un elemento de la categoria personaservice para poder usar los metodos de esta
		PersonaService ps = new PersonaService();
		List<Persona> lista = new ArrayList<>();
		
		boolean exit = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(exit) {
			System.out.println("(1) Buscar una persona por DNI");
			System.out.println("(2) BUscar persona por nombre/Apellido");
			System.out.println("(3) Insertar una nueva persona");
			System.out.println("(0) Salir");
			System.out.println("-----------------------------------------");
			
			Integer ident = sc.nextInt();
			
			switch (ident) {
			case 0:
				System.out.println("Cerrando programa");
				exit = true;
				break;
		    case 1:
		        System.out.println("¿Cual es el dni de la persona?");
		        String dni = sc.nextLine();
		        //llamamos al metodo buscar persona de la clase personaService y le pasamos el dni para que busque
		        System.out.println(ps.buscarPersona(dni));
		        break;
		    case 2:
		    	System.out.println("Introduzca el nombre o apellido de la persona/s");
		    	String cadena = sc.nextLine();
		    	
		    	System.out.println("Personas encontradas:");
		        for (Persona persona : lista) {
		            System.out.println(persona);
		        }
		        break;
		    case 3:
		    	System.out.println("Introduzca los datos de la nueva persona");
		    	
		    	System.out.println("Introduce dni");
		    	String dni_agregar = sc.nextLine();
		    	
		    	System.out.println("Introduce Nombre");
		    	String nombre_agregar = sc.nextLine();
		    	
		    	System.out.println("Introduce apellidos");
		    	String apellidos_agregar = sc.nextLine();
		    	
		    	System.out.println("Introduce fecha nacimiento");
		    	String fnacimiento_agregar = sc.nextLine();
		    	//instruccion importante para el formato de una fecha
		    	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    	
		    	
		    	
		    	
		    	Persona p = new Persona();
		    	p.setDni(dni_agregar);
		    	p.setNombre(nombre_agregar);
		    	p.setApellidos(apellidos_agregar);
		    	//llevar al examen este cacho de codigo para la hora de las fechas
		    	try {
		    		LocalDate fechaNacimiento = LocalDate.parse(fnacimiento_agregar, format);
		    		p.setFecha_nacimiento(fechaNacimiento);
		    	}catch(DateTimeParseException e){
		    		System.out.println("Fecha no correcta");
		    		exit = true;
		    	}
		    	
		    	break; 
		    default:
		        System.out.println("Introduce un valor valido");
		}
		}
		
	
		System.out.println(ps.buscarPersona("Pera"));
		
	}

}
