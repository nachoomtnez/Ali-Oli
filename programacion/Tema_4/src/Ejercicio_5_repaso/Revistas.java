package Ejercicio_5_repaso;


public class Revistas extends Publicaciones{
	
	private boolean consultado;

	public Revistas(Integer codigo, String autor, String titulo, Integer año_publicacion,boolean consultado) {
		super(codigo, autor, titulo, año_publicacion);
		this.consultado = false;
		// TODO Auto-generated constructor stub
	}

	public boolean isConsultado() {
		return consultado;
	}

	public void setConsultado(boolean consultado) {
		this.consultado = consultado;
	}
	
	
	public void retirarParaConsultar() {
		if(this.consultado == false) {
			consultado = true;
		}
	}
	
	public void terminarConsulta() {
		if(this.consultado == true) {
			consultado = false;
		}
	}
	
	public void estaConsultando() {
		if(this.consultado == true) {
			System.out.println("La revista esta siendo consultada");
		}else {
			System.out.println("La resvista NO esta siendo consultada");
		}
	}

	@Override
	public String toString() {
		
		String cad = "El revistas es : ";
		
		cad = cad+super.toString();
		
		
		return cad;
		
	}
	
	
}
