package repaso;

public class Caballo {
	private String nombre;
	private String color;
	private int edad;
	private int carreraGanada;
	
	public Caballo(String nombre,String color,int edad,int carreraGanada) {
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		this.carreraGanada = carreraGanada;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCarreraGanada() {
		return carreraGanada;
	}
	public void setCarreraGanada(int carreraGanada) {
		this.carreraGanada = carreraGanada;
	}
	
	public void imprimeCarrerasGanadas() {
		System.out.println("El numero de carreras ganadas es:"+this.carreraGanada);
	}
	
	public int anyoNacimiento() {
		return 2025-this.edad;
	}
	
	public void incrementarCarrerasGanadas() {
		this.carreraGanada++;
	}
	
	public void relincha() {
		System.out.println("HIIIIIIIEEEEEE");
	}

	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", carreraGanada=" + carreraGanada
				+ "]";
	}
	
	
}
