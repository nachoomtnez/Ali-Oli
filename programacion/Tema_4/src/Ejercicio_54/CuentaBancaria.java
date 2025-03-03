package Ejercicio_54;

import java.util.ArrayList;
import java.util.List;


public class CuentaBancaria {
	
	private String cuenta;
	List<Movimiento>historial_banc = new ArrayList<>();
	
	
	public CuentaBancaria(String cuenta, List<Movimiento> historial_banc) {
		super();
		this.cuenta = cuenta;
		this.historial_banc = historial_banc;
	}
	
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public List<Movimiento> getHistorial_banc() {
		return historial_banc;
	}
	public void setHistorial_banc(List<Movimiento> historial_banc) {
		this.historial_banc = historial_banc;
	}
	
	
}

