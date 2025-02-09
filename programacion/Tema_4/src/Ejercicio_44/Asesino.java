package Ejercicio_44;

public class Asesino extends Personaje{
	
	private Integer daño;
	private Integer tiempoAtaque;
	
	public Asesino(String personaje, Integer puntosVida, String codigo, Integer daño, Integer tiempoAtaque) {
		super(personaje,  codigo,100);
		this.daño = 10;
		this.tiempoAtaque = 5;
	}

	public Integer getDaño() {
		return daño;
	}

	public void setDaño(Integer daño) {
		this.daño = daño;
	}

	public Integer getTiempoAtaque() {
		return tiempoAtaque;
	}

	public void setTiempoAtaque(Integer tiempoAtaque) {
		this.tiempoAtaque = tiempoAtaque;
	}
	
	
}
