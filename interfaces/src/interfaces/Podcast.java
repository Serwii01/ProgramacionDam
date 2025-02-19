package interfaces;

public class Podcast implements Reproducible{
	private String nombre;
	private String duracion;

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo podcast");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando podcast");
	}
//commit
	@Override
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.PODCAST;
		
	}
}
