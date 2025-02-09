package Ejercicio_44;

public class Jugador {
	
	 	private String nombre;
	    private EquipoCombate equipo;

	    public Jugador(String nombre) {
	        this.nombre = nombre;
	        this.equipo = new EquipoCombate();
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public EquipoCombate getEquipo() {
	        return equipo;
	    }

	    @Override
	    public String toString() {
	        return "Jugador: " + nombre;
	    }
}
