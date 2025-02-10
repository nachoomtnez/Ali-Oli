package Ejercicio_42;

public class Jugador {
	
		private String nombre;
		private Integer dorsal;
		
		
		public Jugador(String nombre, Integer dorsal) {
			super();
			this.nombre = nombre;
			this.dorsal = dorsal;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Integer getDorsal() {
			return dorsal;
		}
		public void setDorsal(Integer dorsal) {
			this.dorsal = dorsal;
		}
		@Override
		public String toString() {
			return dorsal+"-"+nombre;
		}
		
		
		
		
}
