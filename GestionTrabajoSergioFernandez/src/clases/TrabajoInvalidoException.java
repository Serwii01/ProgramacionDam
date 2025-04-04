package clases;
//excepcion que extiende de runtimexception para que pueda lanzarse en el momento que encuentre el fallo
public class TrabajoInvalidoException extends RuntimeException {

	public TrabajoInvalidoException(String mensaje) {
		super(mensaje);
	}

	
}
