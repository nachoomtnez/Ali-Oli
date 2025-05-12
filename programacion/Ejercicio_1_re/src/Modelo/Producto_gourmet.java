package Modelo;

import java.math.BigDecimal;

public class Producto_gourmet {
	
	private Integer id;
	private String nombre;
	private String tipo;
	private BigDecimal precio;
	private Boolean disponible;
	
	public Producto_gourmet(){
		
	}
	
	public Producto_gourmet(Integer id, String nombre, String tipo, BigDecimal precio, Boolean disponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.disponible = disponible;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Producto_gourmet [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", disponible=" + disponible + "]";
	}
	
	
}
