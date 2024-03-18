package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.model.Produto;
import ecommerce.model.ProdutoEletrica;
import ecommerce.util.Cores; // importando a classe Cores
import produto.controller.ProdutoController;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		int opcao, numero;
		String nomeProduto, marcaProduto, modeloProduto;
		float precoProduto;

		Scanner leia = new Scanner(System.in);

		while (true) {
			System.out.println(
					Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "********************************************");
			System.out.println("********************************************");
			System.out.println("                                            ");
			System.out.println("          lOJA DE MATERIAIS ELÉTRICOS       ");
			System.out.println("                                            ");
			System.out.println("********************************************");
			System.out.println("          1 - Cadastrar materiais           ");
			System.out.println("          2 - Listar materiais              ");
			System.out.println("          3 - Atualizar Material            ");
			System.out.println("          4 - Apagar material               ");
			System.out.println("          5 - Sair                          ");
			System.out.println("          6 - Sobre                         ");
			System.out.println("                                            ");
			System.out.println("********************************************");
			System.out.println("Entre com a opção desejada:                 " + Cores.TEXT_RESET);
			System.out.println();

			try {
				opcao = leia.nextInt();

			} catch (InputMismatchException e) {

				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;

			}

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n\nLoja de materiais Elétricos");
				sobre();
				leia.close();
				System.exit(0);

			}

			switch (opcao) {

			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar materiais\n\n");
				
				System.out.println("Informe o nome do produto: ");
				leia.skip("\\R?");
				nomeProduto = leia.nextLine();			
			
							
				System.out.println("Informe a marca do produto: ");
				marcaProduto = leia.nextLine();			
			
				
				System.out.println("Informe o modelo do produto: ");
				modeloProduto = leia.nextLine();
				
				
				System.out.println("Informe o preço do produto: ");
				precoProduto = leia.nextFloat();
				
				produtos.cadastrar(new ProdutoEletrica( produtos.gerarNumero(),nomeProduto, precoProduto, marcaProduto, modeloProduto));

						
				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar material\n\n");
				produtos.listarMaterial();
				keyPress();
				break;

			case 3:

				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados do material\n\n");
				
				System.out.println("Informe o número do produto");
				numero = leia.nextInt();
				
				var buscarNumero = produtos.buscarNaCollection(numero);
				
				if(buscarNumero != null);
				
				
				System.out.println("Informe o nome do produto: ");
				leia.skip("\\R?");
				nomeProduto = leia.nextLine();	
				
				System.out.println("Informe a marca do produto: ");
				marcaProduto = leia.nextLine();			
			
				
				System.out.println("Informe o modelo do produto: ");
				modeloProduto = leia.nextLine();
				
				
				System.out.println("Informe o preço do produto: ");
				precoProduto = leia.nextFloat();
				
				produtos.atualizar( new Produto(numero, modeloProduto, precoProduto, modeloProduto, modeloProduto));
				
				
				
				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar material\n\n");
				
				System.out.println("Digite o número do produto que deseja excluir: ");
				numero = leia.nextInt();
				
				produtos.deletar(numero);

				keyPress();
				break;

			default:
				System.out.println("\nOpção inválida!\n");
				break;

			}
		}
	}

	public static void sobre() {
		System.out.println("***********************************************************");
		System.out.println("Projeto desenvolvido por:");
		System.out.println("Alan Eduardo");
		System.out.println("https://github.com/AlanEduardoCruz");
		System.out.println("***********************************************************");

	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
