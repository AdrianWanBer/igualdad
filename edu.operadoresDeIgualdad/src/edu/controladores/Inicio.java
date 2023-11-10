package edu.controladores;

import java.util.Scanner;

import edu.servicios.MenuImplementacion;
import edu.servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		boolean cerrarMenu = false;
		while (!cerrarMenu) {
			
			int seleccion = mi.menuYSeleccion(sc);
			switch(seleccion) {
			case 1:
				cerrarMenu = true;
				break;
			case 2:
				String palabraUno = mi.pedidaDePalabras(sc);
				String palabraDos = mi.pedidaDePalabras(sc);
				if (palabraUno.equals(palabraDos)) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				break;
			case 3:
				String palabraUnoD = mi.pedidaDePalabras(sc);
				String palabraDosD = mi.pedidaDePalabras(sc);
				if (palabraUnoD.equals(palabraDosD)) {
					System.out.println("false");
				}else {
					System.out.println("true3"
							+ "");
				}
				break;
			default:
				break;
			}
		}

	}

}
