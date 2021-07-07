
public class Pagamento implements Calculos{
	
	protected int id;
	protected Funcionario funcionario;
	protected float valorHora;
	protected int horasTrab;
	protected float salario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public int getHorasTrab() {
		return horasTrab;
	}
	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id do pagamento: " + id +
				"\nFuncionário: " + funcionario.toString() +
				"Valor da hora: " + valorHora +
				"\nHoras trabalhadas: " + horasTrab +
				"\nSalario: " + salario;
				
	}
	
	@Override
	public void realizarPagamento() {
		
		salario = valorHora * horasTrab;
		
	}
	
	

}
