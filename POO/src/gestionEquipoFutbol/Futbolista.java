package gestionEquipoFutbol;

public class Futbolista implements Deportista {
	private String nombre;
	private int edad;
	private Posicion posicion;
	private int anyosProfesional;
	private String[] equipos;
	private int trofeos;
	
	public Futbolista(String nombre, int edad, Posicion posicion, int anyosProfesional, String[] equipos,int trofeos) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
		this.anyosProfesional=anyosProfesional;
		this.equipos=equipos;
		this.trofeos=trofeos;
	}
	
	@Override
	public int getAnyosProfesional() {
		return anyosProfesional;
	}


	@Override
	public String getListadoEquipos() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getTotalTrofeos() {
		// TODO Auto-generated method stub
		return trofeos;
	}
	
	}
	
	
