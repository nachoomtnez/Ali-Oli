package modelo;

import java.sql.Date;
import java.time.LocalDate;

import Service.DatosIncompletosException;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fecha_nacimiento;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate localDate) {
		this.fecha_nacimiento = localDate;
	}
	public Boolean validar() throws DatosIncompletosException{
    	if(nombre.equals(null) || nombre.isEmpty()|| apellidos.equals(null) || apellidos.isEmpty()
    			|| dni.equals(null) || dni.isEmpty() || fecha_nacimiento.equals(null)) {
    		throw new DatosIncompletosException ("Hay campos vacíos");
    	}
    	return true;
    }
	
	@Override
	public String toString() {
        return "Persona [DNI = " + dni + ", NOMBRE = " + nombre + ", APELLIDOS = " + apellidos + ", FECHA NACIMIENTO = "+ fecha_nacimiento + "]";
    }
	
	
}
