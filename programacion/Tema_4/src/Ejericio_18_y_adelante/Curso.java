package Ejericio_18_y_adelante;

public class Curso {
	
	private Integer identificador;
	
	private String descripcion;
	
	public Curso() {
		
	}
	public Curso(Integer identificador, String descripcion) {
		
		this.identificador = identificador;
		this.descripcion = descripcion;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	@Override
	public String toString() {
		return "Curso: " + identificador + "º,";
	}
	
	
}
