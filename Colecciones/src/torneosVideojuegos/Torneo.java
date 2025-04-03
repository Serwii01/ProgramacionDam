package torneosVideojuegos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Torneo {
	private List<Jugador> jugadores;

	public Torneo() {
		this.jugadores= new ArrayList<>();
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void agregarJugadores(Jugador j1) throws YaRegistradoException {
		if(jugadores.stream().anyMatch(j->j.getNombre().equalsIgnoreCase(j1.getNombre()))) {
			throw new YaRegistradoException(j1.getNombre()+ " ya está registrado");
		}else {
			jugadores.add(j1);
		}
	}
	
	public void mostrarTop3() {
		jugadores.stream()
				.sorted(Comparator.comparingInt(Jugador::obtenerPuntosTotales).reversed())
				.limit(3)
				.forEach(System.out::println);
	}
	
	public void filtrarPuntos(int ptos) {
	    jugadores.stream()
	        .filter(j -> j.obtenerPuntosTotales() >= ptos)
	        .forEach(System.out::println);
	}
}
