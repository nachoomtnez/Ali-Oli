package Ejercicio_44;

public class Personaje {
	
	protected String personaje;
	protected Integer puntosVida;
	protected String codigo;
	
	public Personaje(String personaje, String codigo,Integer puntosVida) {
		
		this.personaje = personaje;
		this.puntosVida = puntosVida;
		this.codigo = codigo;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}

	public Integer getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(Integer puntosVida) {
		this.puntosVida = puntosVida;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Personaje [personaje=" + personaje + ", puntosVida=" + puntosVida + ", codigo=" + codigo + "]";
	}
	
	
}
