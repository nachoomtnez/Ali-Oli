package Ejercicio_5_repaso;



public class Libros extends Publicaciones{
	
	private boolean prestado;
	private boolean consultado;

	public Libros(Integer codigo, String autor, String titulo, Integer año_publicacion,boolean prestado,boolean consultado) {
		super(codigo, autor, titulo, año_publicacion);
		this.prestado = false;
		this.consultado = false;
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
		
		String cad = "El libro es : ";
		
		cad = cad+super.toString();
		
		
		return cad;
	}
	
	
	public boolean isConsultado() {
		return consultado;
	}



	public void setConsultado(boolean consultado) {
		this.consultado = consultado;
	}



	public void prestar() {
		if(this.prestado == false) {
			this.prestado = true;
		}
	}
	
	public void devolver() {
		if(this.prestado == true) {
			this.prestado = false;
		}
	}
	
	public void estaPrestado() {
		if(this.prestado == true) {
			System.out.println("Este articulo NO esta prestado");
		}else {
			System.out.println("Este articulo esta prestado");
		}
		
	}
	
	public void retirarParaConsultar() {
		if(this.consultado == false) {
			consultado = true;
		}
	}
	
	public void terminarConsulta() {
		if(this.consultado == true) {
			consultado = false;
		}
	}
	
	public void estaConsultando() {
		if(this.consultado == true) {
			System.out.println("El libro esta siendo consultada");
		}else {
			System.out.println("El libro  NO esta siendo consultada");
		}
		
	}
	
	public void estado() {
		if(this.consultado == true) {
			System.out.println("no se puede consultar");
		}
		if(this.prestado == true) {
			System.out.println("no se puede prestar");
		}
	}
	
	
}
