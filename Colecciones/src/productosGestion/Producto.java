package productosGestion;

public class Producto implements Comparable<Producto> {
	private String nombre;
	private double precio;
	private CategoriaProducto producto;
	
	
	public Producto(String nombre, double precio, CategoriaProducto producto) {
		this.nombre = nombre;
		this.precio = precio;
		this.producto = producto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public CategoriaProducto getProducto() {
		return producto;
	}


	public void setProducto(CategoriaProducto producto) {
		this.producto = producto;
	}


	@Override
	public int compareTo(Producto otro) {
		return Double.compare(this.precio, otro.precio);
	}
	
	
	
}

