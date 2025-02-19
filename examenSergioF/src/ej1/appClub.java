package ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class appClub {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		//Atributos de persona
		String nombre, apellidos, dni;
		//Atributos de jugador
		String posicion;
		int numero;
		//Atributos de personal
		String trabajo;
		Float salario;
		//Atributos de club
		String nombreC, ciudad;
		List<Personal> personal = new ArrayList();
		List<Jugador> jugadores = new ArrayList();
		List<ClubFutbol> clubes = new ArrayList();
		
		Jugador j1 = new Jugador("Sergio", "fernandez", "45678901T", 9, "Delantero");
		Jugador j2 = new Jugador("Sergio", "fernandez", "45678901T", 9, "Delantero");

		System.out.println(j1.equals(j2));  // true si equals() está sobreescrito correctamente
		System.out.println(j1.hashCode() == j2.hashCode());  // true si hashCode() está sobreescrito correctamente

		
		int j1hc = j1.hashCode();
		
		if(j1.getApellidos().equals(j2)) {
			//condicion si es verdadero
		}else //condicion si es falso
		
		do {
			menu();
			num = scn.nextInt();
			
			switch (num) {//switch segun los casos se elijan en el menu
			case 1: {
				System.out.print("Ingrese el nombre del jugador: ");
				nombre = scn.next();
				System.out.print("Ingrese los apellidos del jugador: ");
				apellidos = scn.next();
				System.out.print("Ingrese el DNI del jugador: ");
				dni = scn.next();
				System.out.print("Ingrese el número del jugador: ");
				numero = scn.nextInt();
				System.out.print("Ingrese la posición del jugador: ");
				posicion = scn.next();
				crearJugador(nombre, apellidos, dni, numero, posicion, jugadores);
				break;
			}
			case 2: {
				System.out.print("Ingrese el nombre del personal: ");
				nombre = scn.next();
				System.out.print("Ingrese los apellidos del personal: ");
				apellidos = scn.next();
				System.out.print("Ingrese el DNI del personal: ");
				dni = scn.next();
				System.out.print("Ingrese el trabajo del personal: ");
				trabajo= scn.next();
				System.out.print("Ingrese el salario del personal: ");
				salario= scn.nextFloat();
				crearPersonal(nombre, apellidos, dni, trabajo, salario, personal);
				break;
			}
			case 3: {
				System.out.print("Ingrese el nombre del club: ");
				nombreC = scn.next();
				System.out.print("Ingrese el nombre de la ciudad: ");
				ciudad = scn.next();
				crearClub(nombreC, ciudad, jugadores, personal,clubes);
				break;
			}
			case 4:{
				mostrarClub(clubes);
				mostrarJugadoresC(jugadores);
				mostrarPersonalC(personal);
				break;
			}
			
			case 5:{
				int cont= 1;
				for(Jugador i: jugadores) {
					System.out.print(cont);
					System.out.print(i.getNombre());
				}
				System.out.println("Elige un jugador:");
				int indice = scn.nextInt();
				jugadores.get(indice).entrenar();
				System.out.println("El jugador "+jugadores.get(indice).getNombre()+" está entrenando");
				
			}
			default:
				System.out.println("No es una opción valida");
			}
			
		}while(num!=6);
		System.out.println("Saliendo...");
		
	}
	public static void menu() {
		System.out.println("=======MENÚ CLUB DE FUTBOL=======");
		System.out.println("1. Crear Jugador");
		System.out.println("2. Crear Personal");
		System.out.println("3. Crear Club");
		System.out.println("4. Mostrar Información");
		System.out.println("5. Mandar a entrenar");
		System.out.println("6. Salir");//metodo para imprimir el menú
	}
	public static void crearJugador(String nombre, String apellidos, String dni, int numero, String posicion,List<Jugador> jugadores) {
		Persona j1 = new Jugador(nombre, apellidos, dni, numero, posicion);//crea jugador conforme los parametros introducio¡dos
		jugadores.add((Jugador) j1);
		System.out.println(" ");
		System.out.println("Jugador creado con exito");
	}
	public static void crearPersonal(String nombre, String apellidos, String dni, String trabajo, Float salario,List<Personal> personal) {
		Persona p1 = new Personal(nombre, apellidos, dni, trabajo, salario);//crea personal conforme los parametros introducio¡dos
		personal.add((Personal) p1);//lo añade al arraylist personal
		System.out.println(" ");
		System.out.println("Personal creado con exito");
	}
	public static void crearClub(String nombreC, String ciudad,List<Jugador> jugadores,List<Personal> personal, List<ClubFutbol> clubes) {
		ClubFutbol c1 = new ClubFutbol(nombreC, ciudad); //crea un club conforme los parametros introducio¡dos
		c1.setJugadores(jugadores);//le añade el arraylist jugadores
		c1.setPersonal(personal);//le añade el arraylist personal
		clubes.add(c1);//lo añade al arraylist clubes
		System.out.println(" ");
		System.out.println("Club creado con exito");
	}
	public static void mostrarJugadoresC(List<Jugador> jugadores) {//metodo que mediante un foreach y el metodo propio de clase muestra la información
		System.out.println("===JUGADORES===");
		for (Jugador i: jugadores) {
			i.obtenerRol();
			i.infoJ();
		}	
	}
	public static void mostrarPersonalC(List<Personal> personal) {//metodo que mediante un foreach y el metodo propio de clase muestra la información
		System.out.println("===Personal===");
		for (Personal i: personal) {
			i.obtenerRol();
			i.infoJ();
		}
	}
	public static void mostrarClub(List<ClubFutbol> clubes) { //metodo que mediante un foreach y el metodo propio de clase muestra la información
		System.out.println("===Clubes===");
		for (ClubFutbol i: clubes) {
			i.infoC();
			
		}
	}
	
}
