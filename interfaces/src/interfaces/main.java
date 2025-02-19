package interfaces;

import java.util.Scanner;

public class main {
//prueba commit 10
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		
		do {
		menu();
		num = scn.nextInt();
		switch (num) {
		case 1: {
		Reproducible m1 = new Musica();
		menu2();
		int indice = scn.nextInt();
			switch (indice) {
			case 1: {
				m1.reproducir();
				break;
			}
			case 2:{
				m1.pausar();
				break;
			}
			case 3:{
				System.out.println(m1.obtenerTipoContenido()); 
				break;
			}
			
			}
			break;
		}
		case 2:{
			Reproducible p1 = new Pelicula();
			menu2();
			int indice = scn.nextInt();
				switch (indice) {
				case 1: {
					p1.reproducir();
					break;

				}
				case 2:{
					p1.pausar();
					break;

				}
				case 3:{
					System.out.println(p1.obtenerTipoContenido()); 
					break;
				}
				}
				break;
		}
		case 3:{
			Reproducible s1 = new Serie();
			menu2();
			int indice = scn.nextInt();
				switch (indice) {
				case 1: {
					s1.reproducir();
					break;
				}
				case 2:{
					s1.pausar();
					break;
				}
				case 3:{
					System.out.println(s1.obtenerTipoContenido()); 
					break;
				}
				
				}
				break;
		}
		//comment
		case 4:{
			Reproducible pd1 = new Podcast();
			menu2();
			int indice = scn.nextInt();
				switch (indice) {
				case 1: {
					pd1.reproducir();
					break;
				}
				case 2:{
					pd1.pausar();
					break;
				}
				case 3:{
					System.out.println(pd1.obtenerTipoContenido()); 			
					break;
				}
				}
				break;
		}
		default:
			
		}
			
		}while (num!=0);
				
	}
public static void menu() {
	System.out.println("Que quieres reproducir¿?");
	System.out.println("1.Musica");
	System.out.println("2.Pelicula");
	System.out.println("3.Serie");
	System.out.println("4.Podcast");
	System.out.println("0.Salir");
}
public static void menu2() {
	System.out.println("1.Reproducir");
	System.out.println("2.Pausar");
	System.out.println("3.Tipo de contenido");
}
}
