package ejercicio_2_repaso;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalizacionGPS local = new LocalizacionGPS(2233.333,2345.67);
		
		Movil movil = new Movil(654654654,false,local);
		Fijo fijo = new Fijo(954954954,false,"chocobollo");
		
		System.out.println("El numero es movil: "+movil.consultarNumero());
		System.out.println("El numero fijo: "+fijo.consultarNumero());
		
		movil.marcar(654654654);
		movil.marcar(610610610);
		
		movil.colgar();
		movil.colgar();
		
	}

}
