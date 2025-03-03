package Ejercicio_54;

import java.util.List;

public class Cargo extends CuentaBancaria {
	
	private Integer importe;
	private String cif;
	
	
	public Cargo(String cuenta, List<Movimiento> historial_banc,Integer importe,String cif) {
		super(cuenta, historial_banc);
		this.importe = importe;
		this.cif = cif;
	}
	public Integer getImporte() {
		return importe;
	}
	public void setImporte(Integer importe) {
		this.importe = importe;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	@Override
	public String toString() {
		return "Cargo [importe=" + importe + ", cif=" + cif + "]";
	}
	
	
}
