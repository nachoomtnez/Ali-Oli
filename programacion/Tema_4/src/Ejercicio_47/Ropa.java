package Ejercicio_47;

public class Ropa extends Articulo{
	
	private String color;
	private String talla;
	
	
	
	public Ropa(String descripcion, double precio, String color, String talla) {
		
		super(descripcion, precio);
		this.color = color;
		this.talla = talla;
		
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	public String getTalla() {
		return talla;
	}
	
	

	@Override
	public String toString() {
		return "Ropa [color=" + color + ", talla=" + talla + "]";
	}
	
	
}
