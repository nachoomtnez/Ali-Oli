package Ejercicio_32;

public class Reloj {
	
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	
	private boolean formato24horas;

	public Reloj() {
		
		horas = 00;
		minutos = 00;
		segundos = 00;
		formato24horas = true;
	}
	
	
	public Reloj(Integer horas, Integer minutos, Integer segundos, boolean formato24horas) {
		
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.formato24horas = formato24horas;
	}


	public Reloj(boolean formato24horas) {
		this.formato24horas = true;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	public boolean isFormato24horas() {
		return formato24horas;
	}

	public void setFormato24horas(boolean formato24horas) {
		this.formato24horas = formato24horas;
	}
	
	
	public void ponenHora(Integer horas,Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}
	
	public void ponerHoraInteger(Integer horas,Integer minutos,Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public boolean checkear() {
				
		if(horas > 23 ||  horas < 0) {
			return false;
		}
		if(minutos > 59 || minutos < 0 ) {
			return false;
		}	
		
		if(segundos >= 0 || segundos <= 59) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String cadena = "" ;
		if(formato24horas == true) {
			
			cadena=  horas+":"+minutos+":"+segundos;
		}
		else if(formato24horas == false){
			cadena = (horas-12)+":"+minutos+":"+segundos;
		}else {
			cadena = "cadena incorrecta";
		}
		return cadena;
	}
}
