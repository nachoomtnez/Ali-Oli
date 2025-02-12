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
		super();
		this.fecha_creacion = fecha_creacion;
		this.fecha_ultimoCambio = fecha_ultimoCambio;
		this.articulos = articulos;
		this.cliente = cliente;
	}

	public LocalDate getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDate fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public LocalDate getFecha_ultimoCambio() {
		return fecha_ultimoCambio;
	}

	public void setFecha_ultimoCambio(LocalDate fecha_ultimoCambio) {
		this.fecha_ultimoCambio = fecha_ultimoCambio;
	}

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
