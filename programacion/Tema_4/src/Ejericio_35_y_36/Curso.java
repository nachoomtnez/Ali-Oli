package Ejericio_35_y_36;

import java.util.List;

public class Curso {
	
	// ATRIBUTOS
	private Integer identificador;
	private String descripcion;
	private List<Alumno> listaAlumno;

	// CONSTRUCTOR
	public Curso(Integer identificador, String descripcion, List<Alumno> listaAlumno) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.setListaAlumno(listaAlumno);
	}
	
	// METODOS.
	public Integer getIdentificador() {
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
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}

	public List<Alumno> getAlumnos() {
		return listaAlumno;
	}

	public void setAlumnos(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}
	public void addAlumno(Alumno alum) {
		listaAlumno.add(alum);
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}
	
	
	
	
}

