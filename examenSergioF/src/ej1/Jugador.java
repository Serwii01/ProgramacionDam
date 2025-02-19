package ej1;

import java.util.Objects;

public class Jugador extends Persona { //hijo de persona
	
	private int numero;
	private String posicion;
	private boolean activo;

	
	public Jugador(String nombre,  String apellidos,String dni, int numero, String posicion) {
		super(nombre, apellidos, dni);//se le añade super para que use el constructor del padre
		this.numero = numero;
		this.posicion = posicion;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public void setinActivo(boolean activo) {
		this.activo = false;
	}
	public void entrenar() { //metodo entrenar 
		activo=true;
		System.out.println("El jugador esta entrenando");
	}
	@Override
	void obtenerRol() { //método heredado de la clase padre "Persona"
		System.out.println("Jugador");
	}


	public void infoJ() {//metodo para mostrar la informacion
		System.out.println("---------------------");
		System.out.println("Nombre: "+nombre+" "+apellidos);
		System.out.println("DNI: "+dni);
		System.out.println("Posicion: "+posicion);
		System.out.println("¿Entrenando?"+activo);
		System.out.println("---------------------");
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;  // son el mismo objeto en memoria
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;  // si es null o no es de la misma clase no son iguales
	        }
	        Jugador jugador = (Jugador) obj;
	        return numero == jugador.numero &&
	               Objects.equals(nombre, jugador.nombre) &&
	               Objects.equals(apellidos, jugador.apellidos) &&
	               Objects.equals(dni, jugador.dni) &&
	               Objects.equals(posicion, jugador.posicion);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(nombre, apellidos, dni, numero, posicion);
	    }
}
