package basico;

public class Produto {
	private String categoria;
	private String nome;
	private double preco;
	
	//Construtor
	public Produto(String categoria, String nome, double preco) {
		this.categoria = categoria;
		this.nome = nome;
		this.preco = preco;
	}

	// Gets e Sets
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

	
}
