
public class Retangulo implements Forma {
	private int altura;
	private int largura;
	private double area;

	public Retangulo() {}
	
	public Retangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
		this.area = calcularArea(altura,largura);
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public double calcularArea(int largura, int altura) {
		double area = (largura * altura);
		return area;
	}
	
	@Override
	public String toString() {
		return "Retângulo, área: " + area;
	}
}
