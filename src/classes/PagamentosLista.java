import java.util.ArrayList;

public class PagamentosLista {

	private static ArrayList<Pagamento> folhas = new ArrayList<>();
	
	public static void addPagamento(Pagamento p) {
		folhas.add(p);	
	}
	
	public static Pagamento getPagamento(int id) {
		
		for(Pagamento temp : folhas) {
			if( temp.getId() == id)
				return temp;
		}
		return null;
	}
	
	public static ArrayList<Pagamento> getPagamentos(){
		return folhas;
	}
	
	public static void removePagamento(Pagamento p) {
		folhas.remove(p);
	}
}
