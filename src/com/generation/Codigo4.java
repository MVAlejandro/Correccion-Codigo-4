
//El programa nos permite recrear el juego de piedra, papel o tijeras

//Datos de entrada mediante un Scanner:
//String de jugador 1: debe ser piedra, papel o tijeras.
//String de jugador 2: debe ser piedra, papel o tijeras.

//Datos de salida:
//Mensaje por consola mostrando qué jugador ganó.

package com.generation;

import java.util.Scanner; // Se importa la clase Scanner de Java Util

public class Codigo4 {
	public static void main(String[] args) { // Se añade el método main
	Scanner s = new Scanner(System.in); // Se añade el parametro del scanner, en este caso el input
		
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se corrige el jugador en turno
	    // No es necesario declarar un nuevo scanner
	    String j2 = s.nextLine();
	    
	    if (j1.equals(j2)) { // Se corrige == por .equals() para comparar Strings
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) { // Se corrige == por .equals() para comparar Strings
	            g = 1;
	          } break; // Se agrega el break para detener el switch
	
	        case "papel":
	          if (j2.equals("piedra")) { // Se corrige == por .equals() para comparar Strings
	        	g = 1;
	          } break; // Se agrega el break para detener el switch
	          
	        case "tijeras": // se cambia el texto por "tijeras"
	          if (j2.equals("papel")) {
	            g = 1;
	          } break;
	        default:
	      } // switch
	      System.out.println("Gana el jugador " + g);
	    } // if
	    s.close(); // Se cierra el scanner
	} // main
	
} // class Codigo4
