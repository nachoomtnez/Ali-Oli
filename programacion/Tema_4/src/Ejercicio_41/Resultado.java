package Ejercicio_41;

import java.util.Objects;

public class Resultado {
	
	private Integer golesLocales;
	private Integer golesVisitante;
	public Resultado(Integer golesLocales, Integer golesVisitante) {
		super();
		this.golesLocales = 0;
		this.golesVisitante = 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(golesLocales, golesVisitante);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(golesLocales, other.golesLocales) && Objects.equals(golesVisitante, other.golesVisitante);
	}
	
	public boolean isVictoriaLocal() {
		boolean victoria = false;
		if(golesLocales > golesVisitante) {
			victoria = true;
		}
		return victoria;
	}
	
	public boolean isVictoriaVisitante() {
		boolean victoria = false;
		if(golesLocales < golesVisitante) {
			victoria = false;
		}
		return victoria;
	}
	
	public boolean isEmpate() {
		boolean victoria = false;
		
		if(golesLocales == golesVisitante) {
			victoria = true;
		}
		return victoria;

	}

	
}
