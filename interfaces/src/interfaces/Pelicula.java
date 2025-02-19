package interfaces;

public class Pelicula implements Reproducible {
	private String nombre;

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo pelicula");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando pelicula");
	}

	@Override
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.PELICULA;
		
	}
}
