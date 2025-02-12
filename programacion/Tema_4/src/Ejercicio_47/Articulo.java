package Ejercicio_47;

public class Articulo {
	
	private String descripcion;
	private Double precio;
	
	
	
	public Articulo(String descripcion, double precio) {
		
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return "Articulo [descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
