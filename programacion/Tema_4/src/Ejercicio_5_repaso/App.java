package Ejercicio_5_repaso;


import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Publicaciones> publi1 = new ArrayList<>();

		Libros libro = new Libros(001, "J.K. Rowling", "Harry Potter", 2001,false,false);
		Revistas revista = new Revistas(002, "National Geographic", "Explorando el Mundo", 2020,false);
		CD cd = new CD(003, "Coldplay", "Viva la Vida", 2008,false);
		
		

		publi1.add(libro);
		publi1.add(revista);
		publi1.add(cd);
		
		for(Publicaciones publi2 : publi1) {
			System.out.println(publi2);
		}
		
		libro.prestar();
		cd.prestar();
	
		
		libro.retirarParaConsultar();
		cd.estaPrestado();
		
		libro.devolver();
		libro.retirarParaConsultar();
		
		libro.prestar();
		
		for(Publicaciones publi2 : publi1) {
			System.out.println(publi2);
		}
		
		libro.estaConsultando();
		
		libro.estaPrestado();
		
		cd.estaPrestado();
		
		
	}  
}
