package ejercicioIteradores;

public class Main {
	public static void main(String[] args) {
        Redsocial redsocial = new Redsocial();

        redsocial.agregarAmigo(new Usuario("Enrique", 50));
        redsocial.agregarAmigo(new Usuario("Shagguier", 29));
        redsocial.agregarAmigo(new Usuario("Sewi", 17));
        redsocial.agregarAmigo(new Usuario("El ivi", 22));
        redsocial.agregarAmigo(new Usuario("Aivai", 15));
        redsocial.agregarAmigo(new Usuario("Artur DEP", 30));

        System.out.println("Lista de amigos antes de eliminar:");
        redsocial.mostrarAmigos();

        redsocial.eliminarAmigosMenores(18);
        
        System.out.println("\nLista de amigos después de eliminar menores de 18 años:");
        redsocial.mostrarAmigos();

        System.out.println("Buscando a Sofia:");
        redsocial.buscarAmigo("Sofia");

        System.out.println("Buscando a 'Viso Pelota':");
        redsocial.buscarAmigo("Pedro");
    }
}
