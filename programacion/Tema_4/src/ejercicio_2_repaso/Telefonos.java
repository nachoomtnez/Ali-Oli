package ejercicio_2_repaso;

abstract class Telefonos {
	
	private Integer numero;
	private boolean enLlamada;
	
	public Telefonos(Integer numero, boolean enLlamada) {
		this.numero = numero;
		this.enLlamada = false;
	}
	
	public Integer consultarNumero() {
		return numero;
	}
	
	public void marcar(int numeroB) {
		if(numero == numeroB) {
			System.out.println("comunicando");
		}else {
			System.out.println("llamando a "+numeroB);
			System.out.println("En comunicacion");
			this.enLlamada = true;
		}
	}
	
	public void colgar() {
		if(enLlamada = true) {
			System.out.println("Colgando de esta");
			enLlamada = false;
		}
		
	}
	
}
