package Ejercicio_52;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Carrito {
	private LocalDate fecha_creacion = LocalDate.now();
	
	private LocalDate fecha_ultimoCambio = LocalDate.now();
	
	private ArrayList<Articulo> articulos;
	
	private Cliente cliente;

	public Carrito(LocalDate fecha_creacion, LocalDate fecha_ultimoCambio, ArrayList<Articulo> articulos,
			Cliente cliente) {
		this.fecha_creacion = fecha_creacion;
		this.fecha_ultimoCambio = fecha_ultimoCambio;
		this.articulos = articulos;
		this.cliente = cliente;
	}

	public LocalDate getFecha_creacion() {
		return fecha_creacion;
	}

	

	public LocalDate getFecha_ultimoCambio() {
		return fecha_ultimoCambio;
	}

	
	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}


	public Cliente getCliente() {
		return cliente;
	}

	
	public double getCantidad() {
		return articulos.size();
	}
	
	public BigDecimal getTotal() {
		BigDecimal total = new BigDecimal("0");

		for(Articulo articulo : articulos) {
			total = total.add(articulo.getPrecio());
		}
		
		return total;
	}
	
	 public BigDecimal getPrecioMedio() {
	        BigDecimal precio_medio = BigDecimal.ZERO;
	        if (getCantidad() > 0) {
	            precio_medio = getTotal().divide(BigDecimal.valueOf(getCantidad()), BigDecimal.ROUND_HALF_UP);
	        }
	        return precio_medio;
	    }
	
	public void addArticulo(Articulo art) {
		articulos.add(art);
        fecha_ultimoCambio = LocalDate.now(); 
	}
	
	public void borrarArticulo(Articulo art) {
		 articulos.remove(art);
	        fecha_ultimoCambio = LocalDate.now(); 
    }
	
	
	public void vaciarCesta() {
	    articulos.clear();
        fecha_ultimoCambio = LocalDate.now(); // Update last change date
	}
}
