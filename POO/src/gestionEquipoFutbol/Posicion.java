package gestionEquipoFutbol;

public enum Posicion {
	Portero("Portero", 2000,3000),
	Defensa("Defensa",2500,3500),
	Centrocampista("Centrocampista",3500,4000), 
	Delantero("Delantero",4000,5000);
	
	private String posicion;
	private int salarmin;
	private int salarmax;
	
	private Posicion(String posicion, int salarmin, int salarmax) {
		this.posicion=posicion;
		this.salarmin=salarmin;
		this.salarmax=salarmax;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getSalarmin() {
		return salarmin;
	}

	public int getSalarmax() {
		return salarmax;
	}
	
	
	
}
