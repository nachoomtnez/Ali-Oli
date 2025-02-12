package Ejercicio_47;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrito {
	private LocalDate fecha_creacion = LocalDate.now();
	
	private LocalDate fecha_ultimoCambio = LocalDate.now();
	
	private ArrayList<Articulo> articulos;
	
	private Cliente cliente;
	
}
