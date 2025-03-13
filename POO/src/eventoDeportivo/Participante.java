package eventoDeportivo;

public class Participante {
	private String nombre;
    private String apellido;
    private int edad;

    public Participante(String nombre, String apellido, int edad) throws ParticipanteNoValidoException {
        if (nombre == null || apellido == null || edad < 14) {
            throw new ParticipanteNoValidoException("Datos de participante no válidos.");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + edad + " años)";
    }
}
