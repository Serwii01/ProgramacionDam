package SistemaDeReservas;

public interface Reservable {

	public abstract boolean reservar(String usuario, int cantidad);
	
	public abstract boolean cancelarReserva(String usuario);
	
	public abstract int plazasDisponibles();
}
