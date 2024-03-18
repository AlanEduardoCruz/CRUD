package produto.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listarMaterial = new ArrayList<Produto>();
	int numero = 0;

	// Criando metodos de cadastrom listar, atulizar e deltar

	@Override
	public void cadastrar(Produto produto) {
		listarMaterial.add(produto);
		System.out.println("O produto " + numero + " foi criado com sucesso!");

	}

	@Override
	public void listarMaterial() {
		for (var produto : listarMaterial) {
			produto.visualizar();
		}

	}

	@Override
	public void atualizar(Produto produto) {
		var buscarProduto = buscarNaCollection(produto.getNumero());

		if (buscarProduto != null) {
			listarMaterial.set(listarMaterial.indexOf(buscarProduto), produto);

			System.out.println("\nO produto numero: " + produto.getNumero() + " foi atualizado com sucesso!");

		} else {
			System.out.println("\nO produto numero: " + produto.getNumero() + " não foi encontrado!");
		}

	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listarMaterial.remove(produto) == true)
				System.out.println("\n O produto numero: " + numero + " foi deletado com sucesso!");
		}else
			System.out.println("\n O produto conta número: " + numero + " não foi encontrada!");

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaCollection(int numero) {
		for (var buscarNumero : listarMaterial) {
			if (buscarNumero.getNumero() == numero) {
				return buscarNumero;
			}
		}
		return null;
	}

}
