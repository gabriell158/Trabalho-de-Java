
public class Principal {

	public static void main(String[] args) {

		int op, alturaR, larguraR, raioC, alturaT, larguraT;

		do {

			mostrarMenu();
			op = Console.lerInt("Informe uma op: ");

			switch (op) {

				case 1:

					alturaR = Console.lerInt("Informe a altura: ");
					larguraR = Console.lerInt("Informe a largura: ");

					Retangulo r = new Retangulo(alturaR,larguraR);

					RetangulosLista.addRetangulo(r);
					break;

				case 2:

					raioC = Console.lerInt("Informe o raio: ");

					Circulo c = new Circulo(raioC);

					CirculosLista.addCirculo(c);
					break;

				case 3:

					alturaT = Console.lerInt("Informe a altura do Tri�ngulo");
					larguraT = Console.lerInt("Informe a largura do Tri�ngulo");

					Triangulo t = new Triangulo(alturaT, larguraT);

					TriangulosLista.addTriangulo(t);
					break;

				case 4:
				
						for (Retangulo temp : RetangulosLista.getRetangulos()) {
							System.out.println(temp.toString() + "\n");
						}

						for (Circulo temp : CirculosLista.getCirculos()) {
							System.out.println(temp.toString() + "\n");
						}

						for (Triangulo temp : TriangulosLista.getTriangulos()) {
							System.out.println(temp.toString() + "\n");
						}
					break;

				case 5:

					if (RetangulosLista.getRetangulos().size() > 0) {

						for (Retangulo temp : RetangulosLista.getRetangulos()) {
							System.out.println(temp.toString() + "\n");
						}

					} else {
						System.out.println("\nATEN��O: N�o h� pagamentos cadastrados.\nInforme op 2, 3 ou 4 do menu.");
					}

					break;

				case 6:

					if (CirculosLista.getCirculos().size() > 0) {

						for (Circulo temp : CirculosLista.getCirculos()) {
							System.out.println(temp.toString() + "\n");
						}

					} else {
						System.out.println("\nATEN��O: N�o h� pagamentos cadastrados.\nInforme op 2, 3 ou 4 do menu.");
					}

					break;

				case 7:

					if (TriangulosLista.getTriangulos().size() > 0) {

						for (Triangulo temp : TriangulosLista.getTriangulos()) {
							System.out.println(temp.toString() + "\n");
						}

					} else {
						System.out.println("\nATEN��O: N�o h� pagamentos cadastrados.\nInforme op 2, 3 ou 4 do menu.");
					}
					break;

				case 8:

					System.out.println("\nSair");
					break;

				default:
					System.out.println("\nATEN��O: Op��o inv�lida!");
					break;
			}

			System.out.println();

		} while (op != 0);

	}

	private static void mostrarMenu() {
		System.out.println("1) Cadastrar Ret�ngulo");
		System.out.println("2) Cadastrar C�rculo");
		System.out.println("3) Cadastrar Tri�ngulo");
		System.out.println("4) Listar todas as formas");
		System.out.println("5) Listar Ret�ngulos");
		System.out.println("6) Listar C�rculos");
		System.out.println("7) Listar Tri�ngulos");
		System.out.println("8) Sair");
	}

}
