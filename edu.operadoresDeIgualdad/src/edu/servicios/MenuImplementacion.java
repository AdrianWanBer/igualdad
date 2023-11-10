package edu.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int menuYSeleccion(Scanner sc){

        int seleccionDelUsuario;
        System.out.println("-------------------------");
        System.out.println("| Seleccione una opción |");
        System.out.println("|-----------------------|");
        System.out.println("|                       |");
        System.out.println("|       1. Cerrar       |");
        System.out.println("|      2. igualdad      |");
        System.out.println("|     3. desigualdad    |");
        System.out.println("|                       |");
        System.out.println("|-----------------------|");
        
        seleccionDelUsuario = sc.nextInt();
        return seleccionDelUsuario;
	}
	
	public String pedidaDePalabras(Scanner sc) {
		
		System.out.println("Escribre una palabra");
		String palabra = sc.next();
		return palabra;
	}
	
}
