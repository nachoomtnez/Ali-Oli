package Ejercicio_53;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Hucha {
	
	private BigDecimal importe;
	
	
	public Hucha(BigDecimal importe) {
	
		this.importe = BigDecimal.ZERO;
	}

	public BigDecimal meterDinero(BigDecimal cant) {
		importe = importe.add(cant).setScale(2,BigDecimal.ROUND_HALF_UP);
		return importe;
	}
	
	public BigDecimal sacarDinero(BigDecimal cantida) {
		if(importe.compareTo(cantida) > 0){
			importe = importe.subtract(cantida).setScale(2,BigDecimal.ROUND_HALF_UP);
		}else {
			System.out.println("NO se puede hacer la transaccion");
		}
		return importe;
	}
	
	public BigDecimal contarDinero() {
		return importe.setScale(2,BigDecimal.ROUND_HALF_UP);
	}
	
	public BigDecimal romperHucha() {
		BigDecimal aux = importe.setScale(2,BigDecimal.ROUND_HALF_UP);
		importe = BigDecimal.ZERO;
		return aux;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.#€");
		return "Hucha [ importe = " + formato.format(importe) + " ]";
	}
	
}
