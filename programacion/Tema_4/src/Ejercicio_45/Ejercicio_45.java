package Ejercicio_45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		 Integer dia;
		 Integer mes;
		 Integer año;
		 
		 
		 System.out.println("¿En que dia naciste?");
		 dia = sc.nextInt();
		 
		 System.out.println("¿En que mes naciste?");
		 mes = sc.nextInt();
		
		 System.out.println("¿En que año naciste?");
		 año = sc.nextInt();
		 
		 fecha = LocalDate.of(año,mes ,dia);
		 
		 System.out.println(fecha);
		 
		LocalDate fecha_hoy = LocalDate.now();
		
		Period periodo = fecha.until(fecha_hoy);
		Integer edad = periodo.getYears();
		
		 boolean bisiesto = fecha.isLeapYear();
		 
		 if(bisiesto == true) {
			 System.out.println("Es bisiesto");
		 }else {
			 System.out.println("NO es bisiesto");
		 }
		 
		 System.out.println("El dia del mes es: "+fecha.getDayOfWeek());
		 
		 System.out.println("Tienes "+edad+" años");
		 
		 LocalTime hora_actual = LocalTime.now();
		 
			LocalDate fecha_C_años = LocalDate.of(año,mes,dia);
			
			fecha_C_años = fecha.plusYears(100);
			
			Period diferencia = fecha_hoy.until(fecha_C_años);
			
			Integer año_c = diferencia.getYears();
			Integer mes_c = diferencia.getMonths();
			Integer dia_c = diferencia.getDays();
			
			
		System.out.println("Te quedan: "+año_c+" años"+" meses "+mes_c+" y "+dia_c+" dias");
		 
		 DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		 String hora_con_formato = hora_actual.format(formato);
		 
		 System.out.println(hora_con_formato);
	}

}
