package ej1;

public class Personal extends Persona {//hijo de persona
	private String trabajo;
	private Float salario;
	
	public Personal(String nombre, String apellidos, String dni, String trabajo, Float salario) {
		super(nombre, apellidos, dni);//se le añade super para que use el constructor del padre
		this.trabajo = trabajo;
		this.salario = salario;
	}
		
	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public Float getSalario() {
		return salario;
	}
	
	public void setSalario(Float salario) {
		this.salario = salario;
	}


	@Override //metodo abstracto adaptado al hijo
	void obtenerRol() {
		System.out.println("Personal");		
	}
	public void infoJ() { //metodo para mostrar la informacion
		System.out.println("---------------------");
		System.out.println("Nombre: "+nombre+" "+apellidos);
		System.out.println("DNI: "+dni);
		System.out.println("Tranajo: "+trabajo);
		System.out.println("¿Salario: ?"+salario);
		System.out.println("---------------------");
	}
}
