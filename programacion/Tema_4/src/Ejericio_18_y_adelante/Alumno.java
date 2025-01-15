package Ejericio_18_y_adelante;

public class Alumno extends Persona {
	
	private String dni; 
	private double nota;
	private Curso curso;
	

	
	public Alumno(String dni,String nombre,int edad,Curso curso) {
		super(nombre,edad);
		this.dni = dni;
		this.curso = curso;
	}
	

	public String getDni() {
		return dni;
	}

	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNota() {
		return nota;
	}



	public void setNota(double nota) {
		this.nota = nota;
	}

	public void aprobar(double nota) {
		this.nota = 5;
	}

	@Override
	public String toString() {
		return "Dni alumno:" + dni + ", nombre alumno=" + super.getNombre() + ", edad alumno=" + super.getEdad() + ", nota alumno=" + nota + "del curso :"+getCurso();
	}
	
	
}
