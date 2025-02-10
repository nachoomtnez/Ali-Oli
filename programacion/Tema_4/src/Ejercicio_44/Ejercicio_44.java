package Ejercicio_44;

public class Ejercicio_44 {

	public static void main(String[] args) {
	
        Jugador jugador = new Jugador("Jugador1");
        jugador.getEquipo().agregarPersonaje(new Asesino("Asesino1", null, "A1", null, null));
        jugador.getEquipo().agregarPersonaje(new Asesino("Asesino2", null, "A2", null, null));
        jugador.getEquipo().agregarPersonaje(new Asesino("Asesino3", null, "A3", null, null));

     
        Parasito blas = new Parasito("Blas", "B69", null, null, null);
        System.out.println(blas);
        

        if (jugador.getEquipo().agregarPersonaje(blas)) {
            System.out.println("Parásito Blas añadido al equipo.");
        } else {
            System.out.println("No se pudo añadir el parásito Blas.");
        }

      
        System.out.println("Puntos de vida del equipo: " + jugador.getEquipo().getPuntosVidaTotal());

    
        if (jugador.getEquipo().agregarPersonaje(blas)) {
            System.out.println("Parásito Blas añadido nuevamente al equipo.");
        } else {
            System.out.println("El parásito Blas ya está en el equipo.");
        }

     
        System.out.println("Personajes en el equipo:");
        jugador.getEquipo().imprimirPersonajes();

    
        Parasito parasito1 = new Parasito("Parasito1", "P1", null, null, null);
        Parasito parasito2 = new Parasito("Parasito2", "P2", null, null, null);
        
        jugador.getEquipo().agregarPersonaje(parasito1);
        jugador.getEquipo().agregarPersonaje(parasito2);

     
        System.out.println("Personajes en el equipo después de añadir dos parásitos más:");
        jugador.getEquipo().imprimirPersonajes();

     
        System.out.println("Puntos de vida del equipo: " + jugador.getEquipo().getPuntosVidaTotal());
	}

}
