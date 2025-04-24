package Ejercicio_9;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {

		Set<Persona> conjunto = new HashSet<>();
		
		
		public void addPersona(String genero, BigDecimal altura) throws ParametroIncorrectoException{
			try {
				Persona p1 = new Persona();
				p1.setAltura(altura);
				p1.setGenero(genero);
			}catch(ParametroIncorrectoException e) {
				System.out.println("Error: "+e.getMessage());
				throw e;
			}
		}
		
		public BigDecimal calcularAlturaMediaHombre() throws ListaVaciaException{
			
			int cont = 0;
			BigDecimal media = BigDecimal.ZERO;
			
			for(Persona persona : conjunto) {
				if(persona.getGenero().equalsIgnoreCase("h")) {
					media = media.add(persona.getAltura());
					cont++;
				}
			}
			
			if(cont == 0){
				 throw new ListaVaciaException("No hay gente con el genero buscado en la lista");
			}
			
			return media.divide(BigDecimal.valueOf(cont),2,BigDecimal.ROUND_HALF_UP);
		}
		
		public BigDecimal calcularAlturaMediaMujer() throws ListaVaciaException{
			
			int cont = 0;
			BigDecimal media = BigDecimal.ZERO;
			
			for(Persona persona : conjunto) {
				if(persona.getGenero().equalsIgnoreCase("m")) {
					media = media.add(persona.getAltura());
					cont++;
				}
			}
			
			if(cont == 0){
				 throw new ListaVaciaException("No hay gente con el genero buscado en la lista");
			}
			
			return media.divide(BigDecimal.valueOf(cont),2,BigDecimal.ROUND_HALF_UP);
		}
		
		
		public BigDecimal calcularAlturaMedia() throws ListaVaciaException{
			int cont = 0;
			BigDecimal media = BigDecimal.ZERO;
			
			for(Persona persona : conjunto) {
					media = media.add(persona.getAltura());
					cont++;
				}
	
			if(cont == 0){
				 throw new ListaVaciaException("No hay gente con el genero buscado en la lista");
			}
			
			return media.divide(BigDecimal.valueOf(cont),2,BigDecimal.ROUND_HALF_UP);
		}
		
}
