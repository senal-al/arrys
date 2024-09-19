package basico;

public class ArraysIniciais {

	public static void main(String[] args) {
		
		// Declarando um array
		String cores[] = new String[5];
		cores[0] = "Azul";
		cores[1] = "Verde";
		cores[2] = "Amarelo";
		cores[3] = "Branco";
		cores[4] = "Preto";
		
		// Listar os elementos do Array
		System.out.println("Index 0: " + cores[0]);
		System.out.println("Index 1: " + cores[0]);
		System.out.println("Index 2: " + cores[0]);
		System.out.println("Index 3: " + cores[0]);
		System.out.println("Index 4: " + cores[0]);
		
		// Retorna o tamanho do array
		System.out.println(cores.length);
		
		// Listar os elementos do Array
		for (int i = 0; i < cores.length; i++) {
			System.out.println("Index " + i + " : " +  cores[i]);
		}
		
		// O loop for-each
		//Leitura: Para cada número inteiro no array numeros, armazene o valor na variável numero e, em seguida, imprima o valor de numero.
		for (String string : cores) {
			System.out.println(string);
		}
		
		//Array com números
		int numeros[] = {2, 5, 3, 4, 1};
		
		int soma = 0;
		double media;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i]; 
		}
		
		System.out.println("A soma dos números é: " + soma);
		
		media = soma / numeros.length;
		System.out.println("A média é: " + media);
		
	}

}
