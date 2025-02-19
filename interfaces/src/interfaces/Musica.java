package interfaces;

public class Musica implements Reproducible {
	private String nombre;

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo música");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música");
	}

	@Override //commit
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.MUSICA;
		
	}
	
}
