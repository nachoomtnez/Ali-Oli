package Ejercicio_42;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Equipo {
	
		private String nombre;
		private Jugador jugador;
		private List<Jugador> listaJugadores = new ArrayList<>();
		private static String competicion;
		
		public Equipo(String nombre) {
			
			this.nombre = nombre;
		}
		
		
		
		
	@Override
		public int hashCode() {
			return Objects.hash(nombre);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Equipo other = (Equipo) obj;
			return Objects.equals(nombre, other.nombre);
		}


		


		public String getCompeticion() {
			return competicion;
		}




		public void setCompeticion(String competicion) {
			this.competicion = competicion;
		}




		@Override
		public String toString() {
			return "Real Madrid C.F -capitan: "+nombre +" - Jugadores: "+listaJugadores;
		}
}