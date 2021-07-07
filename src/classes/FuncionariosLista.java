import java.util.ArrayList;

public class FuncionariosLista {
	
	private static ArrayList<Funcionario> listaFunc = new ArrayList<>();
	
	public static void addFuncionario(Funcionario f) {
		listaFunc.add(f);
	}
	
	public static Funcionario getFuncionario(int matricula) {
		
		for(Funcionario temp : listaFunc) {
			if(temp.getMatricula() == matricula)
				return temp;		
		}
		
		return null;		
	}
	
	public static String getFuncionarios() {
		String txt = "";
		
		for(Funcionario temp : listaFunc) {
			txt += temp.toString();
		}
				
		return txt;
	}

}
