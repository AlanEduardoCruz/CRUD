package ecommerce.model;

// Classe que representa um produto elétrico
public class ProdutoEletrica extends Produto {
    
    // Construtor para criar instâncias de ProdutoEletrica com os parâmetros especificados
    public ProdutoEletrica(int numero, String nomeProduto, float precoProduto, String marcaProduto, String modeloProduto) {
        // Chama o construtor da classe pai (Produto) para inicializar os atributos herdados
        super(numero, nomeProduto, precoProduto, marcaProduto, modeloProduto);
    }
}
