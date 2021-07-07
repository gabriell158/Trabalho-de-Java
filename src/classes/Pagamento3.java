
public class Pagamento3 extends Pagamento2 implements Calculos {

	private float bonificacao;
	
	public float getBonificacao() {
		return bonificacao;
	}
	
	public void setBonificacao(float bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id do pagamento: " + id +
				"\nFuncionário: " + funcionario.toString() +
				"Valor da hora: " + valorHora +
				"\nHoras trabalhadas: " + horasTrab +
				"\nComissão: " + comissao +
				"\nBonificação: " + bonificacao +
				"\nSalario: " + salario;			
	}
	
	@Override
	public void realizarPagamento() {
		
		salario = valorHora * horasTrab + comissao + bonificacao;
	}
	
}
