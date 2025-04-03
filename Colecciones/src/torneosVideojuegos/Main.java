package torneosVideojuegos;

public class Main {
	public static void main(String[] args) throws YaRegistradoException {
		Torneo t1 = new Torneo();
		
		Jugador j1 = new Jugador("Antonio");
		Jugador j2 = new Jugador("Sevi");
		Jugador j3 = new Jugador("Ibi");
		Jugador j4 = new Jugador("Naripon");
		Jugador j5 = new Jugador("Ibi");
		
		j1.registrarResultados(100);
		j2.registrarResultados(500);
		j3.registrarResultados(300);
		j4.registrarResultados(450);
		j5.registrarResultados(200);
		
		t1.agregarJugadores(j1);
		t1.agregarJugadores(j2);
		t1.agregarJugadores(j3);
		t1.agregarJugadores(j4);
		//t1.agregarJugadores(j5);
		
		t1.mostrarTop3();
		t1.filtrarPuntos(500);
	}
}
