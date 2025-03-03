package ejercicio_2_repaso;

public class LocalizacionGPS {
	
	private double latitud;
	private double longitud;
	
	public LocalizacionGPS(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	
	
}
