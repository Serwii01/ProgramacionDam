package interfaces;

public class Serie implements Reproducible{
	private String nombre;

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo serie");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando serie");
	}

	@Override
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.SERIE;
		
	}
}
