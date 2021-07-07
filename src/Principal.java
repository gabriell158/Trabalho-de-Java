
public class Principal {

	public static void main(String[] args) {

		int op, matricula, id;

		do {

			mostrarMenu();
			op = Console.lerInt("Informe uma op: ");

			switch(op) {

			case 1: // cad funcionario

				System.out.println("\nNovo Funcionário:");
				matricula = Console.lerInt("Informe a matricula: ");

				if(FuncionariosLista.getFuncionario(matricula) == null) {

					Funcionario f = new Funcionario();
					f.setMatricula(matricula);
					f.setNome(Console.lerString("Nome: "));	

					FuncionariosLista.addFuncionario(f);
					System.out.println("\nFuncinário cadastrado com sucesso!");

				} else {

					System.out.println("\nATENÇÃO: Matrícula já em uso!\nRepita a operação.");
				}

				break;

			case 2:

				System.out.println("\nNova folha de pagamento cat. 1:");

				Pagamento p1 = pagamentoBase();

				if(p1 != null) {

					p1.realizarPagamento();
					PagamentosLista.addPagamento(p1);
					System.out.println("\nFolha de pagamento cadastrada!");
				}

				break;

			case 3:

				System.out.println("\nNova folha de pagamento cat. 2:");

				Pagamento p2 = pagamentoBase();

				if(p2 != null) {

					
					Pagamento2 pg2 = new Pagamento2();
					pg2.setId(p2.getId());
					pg2.setFuncionario(p2.getFuncionario());
					pg2.setHorasTrab(p2.getHorasTrab());
					pg2.setValorHora(p2.getValorHora());
					pg2.setComissao(Console.lerFloat("Valor da comissão: "));
					pg2.realizarPagamento();
					PagamentosLista.addPagamento(pg2);
					System.out.println("\nFolha de pagamento cadastrada!");
				}

				break;

			case 4:

				System.out.println("\nNova folha de pagamento cat. 3:");

				Pagamento p3 = pagamentoBase();

				if(p3 != null) {

					
					Pagamento3 pg3 = new Pagamento3();
					pg3.setId(p3.getId());
					pg3.setFuncionario(p3.getFuncionario());
					pg3.setHorasTrab(p3.getHorasTrab());
					pg3.setValorHora(p3.getValorHora());
					pg3.setComissao(Console.lerFloat("Valor da comissão: "));
					pg3.setBonificacao(Console.lerFloat("Valor da bonificação: "));
					pg3.realizarPagamento();
					PagamentosLista.addPagamento(pg3);
					System.out.println("\nFolha de pagamento cadastrada!");
				}
				
				break;

			case 5:

				System.out.println("\nBuscar folha de pagamento");
				id = Console.lerInt("Informe o id da folha que deseja buscar: ");
				
				Pagamento buscar = PagamentosLista.getPagamento(id);
				
				if(buscar == null) {
					System.out.println("\nATENÇÃO: Id de pagamento não localizado.\nRefaça a operação.");
				} else {
					System.out.println("\nFolha localizada:\n" + buscar.toString());
				}
				
				
				break;

			case 6:

				if(PagamentosLista.getPagamentos().size() > 0) {
					
					System.out.println("\nFolhas de pagamento cadastradas:\n");
					
					for(Pagamento temp : PagamentosLista.getPagamentos()) {
						System.out.println(temp.toString() + "\n");
					}
					
				} else {
					System.out.println("\nATENÇÃO: Não há pagamentos cadastrados.\nInforme op 2, 3 ou 4 do menu.");
				}
				
				break;

			case 7:

				System.out.println("\nExcluir folha de pagamento");
				id = Console.lerInt("Informe o id da folha que deseja excluir: ");
				
				Pagamento excluir = PagamentosLista.getPagamento(id);
				
				if(excluir == null) {
					System.out.println("\nATENÇÃO: Id de pagamento não localizado.\nRefaça a operação.");
				} else {
					PagamentosLista.removePagamento(excluir);
					System.out.println("\nFolha excluída com sucesso!");
				}
				
				break;

			case 0:

				System.out.println("\nSistema finalizado.\nObrigado por utilizar o Pagamento System!");	
				break;

			default:
				System.out.println("\nATENÇÃO: Opção inválida!");
				break;
			}

			System.out.println();

		}while(op != 0);		

	}


	private static void mostrarMenu() {


		System.out.println("\nFolha de Pagamento");
		System.out.println("1) Cadastrar Funcionário");
		System.out.println("2) Cadastrar Pagamento Cat. 1");
		System.out.println("3) Cadastrar Pagamento Cat. 2");
		System.out.println("4) Cadastrar Pagamento Cat. 3");
		System.out.println("5) Buscar Pagamento");
		System.out.println("6) Listar todos os pagamentos");
		System.out.println("7) Excluir pagamento");
		System.out.println("0) Sair");	


	}


	private static Pagamento pagamentoBase() {


		int id = Console.lerInt("Informe o id do pagamento: ");

		if(PagamentosLista.getPagamento(id) == null) { // se retornar nul, sinal que não existe nenhuma pagamento na lista com este id

			// recebe uma string com o nome e mat de todos os funcionarios concatenados, ou, uma string vazia
			String funcionarios = FuncionariosLista.getFuncionarios();

			// verificar se a string está vazia
			if(funcionarios.equals(""))
			{
				System.out.println("\nATENÇÃO: não há funcionários cadastrados!\nAcesse a op. 1 do menu.");
			}
			else // senão (ou seja, se há ao menos um funcionario cadastrado, a string não está vazia. Então:
			{
				// prosseguir com o cadastro:
				Pagamento p = new Pagamento();
				p.setId(id);


				System.out.println("\nInforme a matrícula de um dos funcionários abaixo para gerar sua folha de pagamento:");

				System.out.println(funcionarios);

				int op2 = Console.lerInt("Matricula: ");

				// verificar se a matricula é valida

				//se não for válida:
				if(FuncionariosLista.getFuncionario(op2) == null) {
					System.out.println("\nATENÇÃO: Matrícula inválida.\nRefaça a operação.");

				} else { // se for válida:

					p.setFuncionario(FuncionariosLista.getFuncionario(op2));
					p.setValorHora(Console.lerFloat("Valor da hora de trabalho: "));
					p.setHorasTrab(Console.lerInt("Horas trabalhadas no mês: "));

					return p;					
				}	

			}


		} else {

			System.out.println("\nATENÇÃO: este id já está em uso em outro pagamento!\nPor favor, refaça a operação.");
		}

		return null;


	}

}
