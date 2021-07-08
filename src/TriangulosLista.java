
import java.util.ArrayList;

public class TriangulosLista {

	private static ArrayList<Triangulo> listaTrinagulo = new ArrayList<>();

	public static void addTriangulo(Triangulo t) {
		listaTrinagulo.add(t);
	}	

	public static ArrayList<Triangulo> getTriangulos() {

		return listaTrinagulo;
	}
}
