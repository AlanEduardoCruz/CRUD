package produto.repository;

import ecommerce.model.Produto; // Importa a classe Produto do pacote ecommerce.model

// Interface que define métodos para operações de CRUD em relação aos produtos
public interface ProdutoRepository {
	
	// Criando Metodo CRUD
	
	// Método para cadastrar um novo produto na loja
	public void cadastrar(Produto produto);

	// Método para listar todos os materiais disponíveis na loja
	public void listarMaterial();

	// Método para atualizar as informações de um produto existente na loja
	public void atualizar(Produto produto);

	// Método para deletar um produto da loja com base no número do produto
	public void deletar(int numero);
}
