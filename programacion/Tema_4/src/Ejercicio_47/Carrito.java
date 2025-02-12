package Ejercicio_47;

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
	
	public double getTotal() {
		double total = 0;
		for(int i = 0; i < articulos.size(); i++) {
			total += articulos.get(i).getPrecio();
		}
		
		return total;
	}
	
	public double getPrecioMedio() {
		double precio_medio = 0;
		
		return precio_medio = getTotal()/getCantidad();
		
	}
	
	public void addArticulo() {
		
	}
	
	public void borrarArticulo() {
		
	}
	
	public void vaciarCesta() {
		
	}
}
