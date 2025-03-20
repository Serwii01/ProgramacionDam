package apis;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListaPalabras implements Iterable<String>  {
	private List <String> palabras;
	
	public ListaPalabras(String... polla) {
		this.palabras = Arrays.asList(polla);
	}
	@Override
	public Iterator<String> iterator() {
		return palabras.iterator();
	}
	
	public static void main(String[] args) {
		ListaPalabras lista = new ListaPalabras("Hola", "Quique", "Koke", "visazo");
		
		for(String palabra: lista) {
			System.out.println(palabra);
		}
		
	}

}
