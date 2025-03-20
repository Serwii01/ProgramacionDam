package apis;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteradorInverso implements Iterator<String> {
	private List<String> lista;
	private int posicion;
	
	public IteradorInverso(List<String> lista) {
		this.lista = lista;
		posicion = lista.size()-1;
	}
	
	@Override
	public boolean hasNext() {
		return posicion >=0;
	}

	@Override
	public String next() {
		return lista.get(posicion--);
	}
    public static void main(String[] args) {
    	List<String> nombres = Arrays.asList("viso","ivicock","Sergio","Acho"); 
    	Iterator<String> it = new IteradorInverso(nombres);
    	while(it.hasNext()) {
    		System.out.println(it.next());
    	}
    }

	
}
