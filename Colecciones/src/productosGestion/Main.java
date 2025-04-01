package productosGestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
	
		List<Producto>productos=new ArrayList<>();
		Producto p1 = new Producto("pc", 599.99, CategoriaProducto.ELECTRONICA);
		productos.add(p1);
		
		Collections.sort(productos);
		productos.forEach(System.out::println);
	
		Map<CategoriaProducto, List<Producto>> prodCateg = new HashMap<>();
		for(Producto p : productos) {
			if(!prodCateg.containsKey(p.getProducto())) {
				prodCateg.put(p.getProducto(),new ArrayList<>());
			}
			prodCateg.get(p.getProducto()).add(p);
		}
		
		productos.stream()
			.filter(p -> p.getPrecio()>50)
			.forEach(System.out::println);
	}
}
