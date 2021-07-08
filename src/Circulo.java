
public class Circulo implements Forma {
	protected double area;
	private int raio;

	public Circulo() {}
	
	public Circulo(int raio) {
		this.raio = raio;
		this.area = calcularArea(raio,raio);
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea(int largura, int altura) {
		double area = ( 3.14 * (largura * altura));
		return area;
	}

	@Override
	public String toString() {
		return "Círculo, área: " + area;
	}
}
