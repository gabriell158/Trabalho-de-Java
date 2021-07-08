
import java.util.ArrayList;

public class RetangulosLista {

	private static ArrayList<Retangulo> listaRetangulo = new ArrayList<>();

	public static void addRetangulo(Retangulo r) {
		listaRetangulo.add(r);
	}	

	public static ArrayList<Retangulo> getRetangulos() {
		
		return listaRetangulo;
	}
  
}
