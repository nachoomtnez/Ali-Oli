package Ejercicio_54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimiento {
	
	private LocalDate fecha;
	private BigDecimal importe;
	
	public Movimiento(LocalDate fecha, BigDecimal importe) {
		super();
		this.fecha = fecha;
		this.importe = importe;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
}
