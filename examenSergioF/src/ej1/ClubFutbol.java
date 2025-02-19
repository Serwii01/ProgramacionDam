package ej1;

import java.util.List;
import java.util.ArrayList;


public class ClubFutbol {
	private String nombre;
	private String ciudad;
	private List<Personal> personal = new ArrayList();
	private List<Jugador> jugadores = new ArrayList();
	
	public ClubFutbol(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.personal = new ArrayList();
		this.jugadores = new ArrayList();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Personal> personal) {
		this.personal = personal;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void mostrarJugadores() {
		for (Jugador i: jugadores) {
			System.out.println(i.toString());
		}
	}
	public void infoC() {
		System.out.println("---------------------");
		System.out.println("Nombre: "+nombre);
		System.out.println("Ciudad: "+ciudad);
		System.out.println("---------------------");
	}
	
}
