package default_package;

public class Produto {

	private String descricao;
	private int quantidade;
	
	Produto(){
		
	}
	
	public void setObterDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getObterDescricao() {
		return descricao;
	}
	
	
	public void setObterQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	public int getObterQuantidade() {
		return quantidade;
	}
	
	public void descrever() {
		System.out.println("Produto: " + getObterDescricao() + " - " + getObterQuantidade() + " Itens");
	}
	
	
}

