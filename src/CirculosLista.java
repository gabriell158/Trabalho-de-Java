
import java.util.ArrayList;

public class CirculosLista {

	private static ArrayList<Circulo> listaCirculo = new ArrayList<>();

	public static void addCirculo(Circulo c) {
		listaCirculo.add(c);
	}	

	public static ArrayList<Circulo> getCirculos() {

		return listaCirculo;
	}
}
