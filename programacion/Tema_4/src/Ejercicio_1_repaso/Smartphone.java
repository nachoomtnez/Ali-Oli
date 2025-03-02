package Ejercicio_1_repaso;

import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
	
		private String marca;
		private String modelo;
		private String imei;
		private double precio;
		private LocalDate fecha_fabricacion;
		private boolean activo;
		
		public Smartphone(String marca, String modelo, String imei, 
				Double precio, LocalDate fecha_fabricacion,boolean activo) {
		
			this.marca = "";
			this.modelo = "";
			this.imei = "";
			this.precio = 0;
			this.fecha_fabricacion = null;
			this.activo = true;
		}
		public Smartphone(String imei) {
			
			this.imei = imei;
		}

		public Smartphone(String marca, String modelo, String imei) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.imei = imei;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public void activar() {
			this.activo = true;
		}
		
		public void desactivar() {
			this.activo = false;
		}
		
		public void gerEdad() {
			LocalDate fecha = LocalDate.of(1, 4, 2000);
			Period periodo = fecha.until(fecha_fabricacion);
			
			Integer años_dif = periodo.getYears();
			System.out.println("Años dif "+años_dif);
		}
		
		public void cambiarMarcaModelo(String marcaNueva, String modeloNuevo) {
			this.marca = marcaNueva;
			this.modelo = modeloNuevo;
		}
		
		public void establecerFabricacion(LocalDate fecha_f) {
			this.fecha_fabricacion = fecha_f;
		}
		
		
		public boolean isAltaGama(double precio2) {
			boolean comp = false;
			
			if(this.precio > precio2) {
				comp = true;
			}
			
			return comp;
		}
		
		public boolean isDatosCompletos() {
			boolean comp = false;
			
			if(imei != null && !imei.isEmpty() && !imei.isBlank()) {
				if(precio != 0) {
					comp = true;
				}
				
			}
			return comp;
		}
		
		public boolean isGratis() {
			boolean comp = false;
			
			if(precio == 0) {
				comp = true;
			}
			return comp;
		}
		
		public double rebajar() {
			return this.precio = precio - 10;
		}
		
		
}
