
public class Triangulo implements Forma {
	private int altura;
	private int largura;
	private double area;
	
	public Triangulo() {}
	
	public Triangulo(int altura, int largura) {
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

	@Override
	public double calcularArea(int largura, int altura) {
		double area = ((largura * altura )/2);
		return area;
	}

	@Override
	public String toString() {
		return "Triangulo, área: " + area;
	}
}