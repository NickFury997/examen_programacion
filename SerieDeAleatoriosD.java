import java.util.ArrayList;
import java.util.Random;
public class SerieADeleatoriosD {

	private ArrayList<Integer> serieAleatoria;
	public SerieDeAleatoriosD (int numeroItems) {
		serieAleatoria = new ArrayList<Integer> ();
		for (int i = 0; i < numeroItems; i++) {
			serieAleatoria.add(0);
			System.out.println("Serie inicializada. El numero de elementos serie es");
		}
	}
	public int getNumeroItems() {
		return serieAleatoria.size();
	}
	public void generarSerieDeAleatorios() {
		Random numAleatorio;
		numAleatorio  new Random();
		for (int i = 0; i < serieAleatoria.size(); i++) {
			serieAleatoria.set(1, numAleatotrio);
			System.out.println("Serie generada");
		}
	}
}
