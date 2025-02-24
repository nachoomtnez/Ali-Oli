package Ejercicio_53;

import java.math.BigDecimal;

public class Ejercicio_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Hucha hucha = new Hucha(null);
        System.out.println(hucha);

      
        hucha.meterDinero(new BigDecimal("100"));
        System.out.println(hucha); 


        hucha.meterDinero(new BigDecimal("50.501"));
        System.out.println(hucha);  

    
        hucha.sacarDinero(new BigDecimal("20.5"));
        System.out.println(hucha);  

        
        hucha.sacarDinero(new BigDecimal("200"));
        System.out.println(hucha); 

        hucha.meterDinero(new BigDecimal("20.5"));
        System.out.println(hucha);

     
        BigDecimal cantidadContada = hucha.contarDinero();
        hucha.meterDinero(cantidadContada);
        System.out.println(hucha); 

     
        BigDecimal dineroRomperHucha = hucha.romperHucha();
        hucha.meterDinero(dineroRomperHucha);
        System.out.println(hucha);
	}

}
