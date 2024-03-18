package ecommerce.model;

public class Produto {

	public int numero;
	private String nomeDoProduto;
	private float precoDoProduto;
	private String marcaDoProduto;
	private String modeloDoProduto;

	// Gerando anotações nos parametros
	public Produto(int numero, String nomeDoProduto, float precoDoProduto, String marcaDoProduto,
			String modeloDoProduto) {

		this.numero = numero;
		this.nomeDoProduto = nomeDoProduto;
		this.precoDoProduto = precoDoProduto;
		this.marcaDoProduto = marcaDoProduto;
		this.modeloDoProduto = modeloDoProduto;

	}

	// Metodos get e set

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public float getPrecoDoProduto() {
		return precoDoProduto;
	}

	public void setPrecoDoProduto(float precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}

	public String getMarcaDoProduto() {
		return marcaDoProduto;
	}

	public void setMarcaDoProduto(String marcaDoProduto) {
		this.marcaDoProduto = marcaDoProduto;
	}

	public String getModeloDoProduto() {
		return modeloDoProduto;
	}

	public void setModeloDoProduto(String modeloDoProduto) {
		this.modeloDoProduto = modeloDoProduto;
	}

	// criando método para visualizar, exibir os dados.

	public void visualizar() {

		System.out.println("\n\n*************************************************");
		System.out.println("Dados dos materiais:");
		System.out.println("\n\n*************************************************");
		System.out.println("Numero do produto: " +  this.numero);
		System.out.println("Nome do produto: " + this.nomeDoProduto);
		System.out.println("Preço do produto: " + this.precoDoProduto);
		System.out.println("Marca do produto: " + this.marcaDoProduto);
		System.out.println("Modelo do produto: " + this.modeloDoProduto);

	}

}
