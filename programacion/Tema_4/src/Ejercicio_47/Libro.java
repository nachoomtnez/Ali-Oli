package Ejercicio_47;

public class Libro extends Articulo{
	
	private String autor;
	
	

	public Libro(String autor,String descripcion, double precio) {
		super(descripcion, precio);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + "]";
	}
	
	
}
