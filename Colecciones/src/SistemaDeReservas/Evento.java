package SistemaDeReservas;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Evento implements Reservable{

	private String nombre;
	private LocalDate fecha;
	private int capacidad;
	private Map<String, Integer> reservas;
	
	
	
	public Evento(String nombre, LocalDate fecha, int capacidad) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.capacidad = capacidad;
		this.reservas = new HashMap<>(); //los datos estan ordenados al introducirse
	}

	@Override
	public boolean reservar(String usuario, int cantidad) {
		if(cantidad>capacidad) {
			throw new CapacidadInsuficienteException("No hay plazas disponibles");
		}else {
			reservas.put(usuario, reservas.getOrDefault(usuario, 0)+cantidad);
			return true;
		}
	}
	
	@Override
	public boolean cancelarReserva(String usuario) {
		if(!reservas.containsKey(usuario)) {
			throw new ErrorCancelacionException("No tienes reserva");
		}else {
			reservas.remove(usuario);
			return true;
		}
	}
	
	@Override
	public int plazasDisponibles() {
		int reservadas = reservas.values().stream().reduce(0, (a,b) -> a+b);
		return capacidad - reservadas;
	}
	
	
	
}
