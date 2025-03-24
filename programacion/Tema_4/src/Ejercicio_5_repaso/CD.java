package Ejercicio_5_repaso;

public class CD extends Publicaciones {
	private boolean prestado;

	public CD(Integer codigo, String autor, String titulo, Integer año_publicacion, boolean prestado) {
		super(codigo, autor, titulo, año_publicacion);
		this.prestado = false;
		// TODO Auto-generated constructor stub
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
String cad = "El cd es : ";
		
		cad = cad+super.toString();
		
		
		return cad;
	}

	public void prestar() {
		if (prestado == false) {
			this.prestado = true;
		}
	}

	public void devolver() {
		if (prestado == true) {
			this.prestado = false;
		}
	}

	public void estaPrestado() {
		if (prestado == true) {
			System.out.println("Este articulo NO esta prestado");
		} else {
			System.out.println("Este articulo esta prestado");
		}

	}
}