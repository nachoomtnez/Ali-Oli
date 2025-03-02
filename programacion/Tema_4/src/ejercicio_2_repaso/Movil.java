package ejercicio_2_repaso;

public class Movil extends Telefonos{
	
	private LocalizacionGPS posicionGPS;
	

	public Movil(Integer numero, boolean enLlamada,LocalizacionGPS posicionGPS) {
		super(numero, enLlamada);
		this.posicionGPS = posicionGPS;
		
	}





	public LocalizacionGPS getPosicionGPS() {
		return posicionGPS;
	}


	public void setPosicionGPS(LocalizacionGPS posicionGPS) {
		this.posicionGPS = posicionGPS;
	}
	
	
}
