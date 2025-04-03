package torneosVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jugador implements Competidor {

	private String nombre;
	private LocalDate registro;
	List<Integer> puntos;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.registro = LocalDate.now();
		this.puntos = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getRegistro() {
		return registro;
	}

	public void setRegistro(LocalDate registro) {
		this.registro = registro;
	}

	public List<Integer> getPuntos() {
		return puntos;
	}

	public void setPuntos(List<Integer> puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", registro=" + registro + ", puntos=" + puntos + "]";
	}

	@Override
	public void registrarResultados(int ptos) {
	puntos.add(ptos);
	}

	@Override
	public int obtenerPuntosTotales() {
		return puntos.stream()
				.reduce(0, Integer::sum);
	}

}
