package Ejericio_18_y_adelante;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	
	private String dni; 
	private Double nota;
	private Curso curso;
	
	public Alumno(){
		
	}
	
	public Alumno(String dni,String nombre,Integer edad,Curso curso,Double nota) {
		super(nombre, edad);
		this.dni = dni;
		this.curso = curso;
		this.nota = nota;
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
		this.dni = dni.toUpperCase();
	}

	public double getNota() {
		return nota;
	}



	public void setNota(Double nota) {
		this.nota = nota;
	}

	public void aprobar(Double nota) {
		this.nota = 5.0;
	}
	
	public boolean equals(Object o) {
		
		boolean resul = false;
		Alumno alumno2 = (Alumno) o;
		
		if(dni.equals(alumno2.getDni())) {
			resul = true;
		}else {
			resul = false;
		}
		return resul;
	}
	
	public boolean validarDni() {
		
		boolean cmp = false;
		
		if(dni == null || dni.length() != 9) {
			System.out.println("DNI INVALIDO UTILICE UN FORMATO CORRECTO");
		}else {
			String ejemploDni = "00000000T";
			Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
			Matcher match = patron.matcher(ejemploDni);
			if(match.matches()) {
			 cmp = true;
			}
			else {
			cmp = false;
			} 
		}
		return cmp; 
	}
	
	public boolean validar() {
		boolean cmp = false;
		
		if(validarDni() == true) {
			if(curso != null) {
				if(nombre != null && nombre.length() > 10) {
					if( edad != null && edad <= 65 && edad >= 12) {
						cmp = true;
					}
				}
			}
		}
		return cmp;
	}
	@Override
	public String toString() {
		return "Dni alumno:" + dni + ", nombre alumno=" + getNombre() + ", edad alumno=" + getEdad() + ", nota alumno=" + nota + "del curso :"+curso;
	}
	
	
}
