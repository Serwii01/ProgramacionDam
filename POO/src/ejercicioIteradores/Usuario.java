package ejercicioIteradores;

public class Usuario {
	String nombre;
    int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
