
public class Pagamento2 extends Pagamento implements Calculos {

	protected float comissao;
	
	public float getComissao() {
		return comissao;
	}
	
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id do pagamento: " + id +
				"\nFuncion�rio: " + funcionario.toString() +
				"Valor da hora: " + valorHora +
				"\nHoras trabalhadas: " + horasTrab +
				"\nComiss�o: " + comissao +
				"\nSalario: " + salario;			
	}
	
	@Override
	public void realizarPagamento() {
		
		salario = valorHora * horasTrab + comissao;
	}
	
}
