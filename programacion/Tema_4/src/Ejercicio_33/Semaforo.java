package Ejercicio_33;

public class Semaforo {

		private String color = "";
		public static final String verde = "verde";
		public static final String rojo = " rojo";
		public static final String ambar = "ambar";
		
		
		private Boolean parpadeando = false;
		
		
		public Semaforo() {
			this.color = rojo;
			this.parpadeando = false;
		}


		


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			if(color.equalsIgnoreCase(rojo)|| color.equalsIgnoreCase(ambar) || color.equalsIgnoreCase(verde)) {
				this.color = color;
				this.parpadeando = false;
			}
		}


		public Boolean getParpadeando() {
			return parpadeando;
		}


		public void setParpadeando(Boolean parpadeando) {
			if(color.equalsIgnoreCase(ambar)) {
				this.parpadeando = parpadeando;
			}
			
		}
		
		public void cambiarEstado() {
			if(color.equalsIgnoreCase(ambar) && parpadeando == true ) {
				setParpadeando(false);
				setColor(rojo);
			}else {
				switch(color){
				case rojo:
					setColor(verde);
					break;
				case verde:
					setColor(ambar);
					break;
				case ambar:
					setParpadeando(true);
					break;
			}
			}
			
		}


		@Override
		public String toString() {
			if(color.equalsIgnoreCase(ambar) && parpadeando == true) {
				 return "Semaforo en "+ color.toUpperCase() +" parpadeando";
			}
			return "Semaforo en " +color.toUpperCase();
		}
		
		
		
}
