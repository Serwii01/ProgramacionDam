package productosGestion;

public class Producto {
	private String nombre;
	private String precio;
	private CategoriaProducto producto;
	
	
	public Producto(String nombre, String precio, CategoriaProducto producto) {
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


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public CategoriaProducto getProducto() {
		return producto;
	}


	public void setProducto(CategoriaProducto producto) {
		this.producto = producto;
	}
	
	
	
}

