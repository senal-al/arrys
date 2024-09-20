package basico;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class ProdutosNoArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int qtdProdutos;
		
		System.out.println("Informe a quantidade de produtos para o cadastro: ");
		qtdProdutos = input.nextInt();
		
		Produto produtos[] = new Produto[qtdProdutos];		
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Informe a categoria do produto: ");
			String categoria = input.next();
			
			System.err.println("Informe o nome do produto: ");
			String nome = input.next();
			
			System.out.println("Informe o preço do produto");
			double preco = input.nextDouble();
			
			produtos[i] = new Produto(categoria, nome, preco);
		}
		
		double somaDosProdutos = 0.0;
		for (int i = 0; i < produtos.length; i++) {
			somaDosProdutos += produtos[i].getPreco();
		}
		
		double media = somaDosProdutos / produtos.length;
		
		// Listar os produtos
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].getNome() + " R$: " + produtos[i].getPreco());
		}
		
		System.out.println("---------------------------\n");
		System.out.println("Preço médio R$: " + media);
		
		input.close();
	}

}
