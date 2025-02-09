package Ejercicio_44;

public class Parasito extends Personaje{
	private Integer daño;
	private Integer tiempoAtaque;
	
	public Parasito(String personaje,  String codigo, Integer puntosVida, Integer daño, Integer tiempoAtaque) {
		super(personaje, codigo , 200);
		this.daño = 2;
		this.tiempoAtaque = 1;
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

	@Override
	public String toString() {
		return "Parasito [daño=" + daño + ", tiempoAtaque=" + tiempoAtaque + "]";
	}
	
	
}
