package ejercicioIteradores;

public class Main {
	public static void main(String[] args) {
        Redsocial redsocial = new Redsocial();

        redsocial.addAmigo(new Usuario("Enrique", 50));
        redsocial.addAmigo(new Usuario("Shagguier", 29));
        redsocial.addAmigo(new Usuario("Sewi", 19));
        redsocial.addAmigo(new Usuario("El ivi", 22));
        redsocial.addAmigo(new Usuario("Aivai", 15));
        redsocial.addAmigo(new Usuario("Artur DEP", 30));

        System.out.println("Lista de amigos antes de eliminar:");
        redsocial.mostrarAmigos();
        System.out.println(" ");
        redsocial.eliminarAmigosMenores(18);
        System.out.println(" ");
        System.out.println("Lista de amigos después de eliminar menores de 18 años:");
        redsocial.mostrarAmigos();

        System.out.println("Buscando a Sewi:");
        redsocial.buscarAmigo("Sewi");

        System.out.println("Buscando a 'Viso Pelota':");
        redsocial.buscarAmigo("Viso Pelota");
    }
}
