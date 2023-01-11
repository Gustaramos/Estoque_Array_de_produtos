package default_package;

public class Estoque {
	Produto[] produtos;
	private int quantidadeTotal;
	
	public void listarProdutos() {
		System.out.println("Produtos em estoque:");
		System.out.println("---------------------");
		
		for(int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}
	
	public void totalItens() {
		for(int i = 0; i < produtos.length; i++) {
		this.quantidadeTotal += produtos[i].getObterQuantidade();
		}
		System.out.println("Quantidade total de itens no estoque: " + quantidadeTotal);
	}
}