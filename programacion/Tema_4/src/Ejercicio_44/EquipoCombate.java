package Ejercicio_44;

import java.util.ArrayList;

public class EquipoCombate {
	
	    private ArrayList<Personaje> personajes;

	    public EquipoCombate() {
	        personajes = new ArrayList<>(); 
	    }

	    public boolean agregarPersonaje(Personaje personaje) {
	        if (personajes.size() < 5) {
	          
	            for (Personaje p : personajes) {
	                if (p.getCodigo().equals(personaje.getCodigo())) {
	                    return false; 
	                }
	            }
	            personajes.add(personaje);
	            return true;
	        }
	        return false; 
	    }

	    public int getPuntosVidaTotal() {
	        int totalVida = 0;
	        for (Personaje personaje : personajes) {
	            totalVida += personaje.getPuntosVida();
	        }
	        return totalVida;
	    }

	    public void imprimirPersonajes() {
	        for (Personaje personaje : personajes) {
	            System.out.println(personaje);
	        }
	    }
	}

