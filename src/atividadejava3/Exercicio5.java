package atividadejava3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// entrada de números inteiros via teclado até que o número zero seja digitado
		// mostrar na tela a soma de todos os números digitados positivos 
		Scanner leia = new Scanner(System.in);
		int numeros;
		 int soma = 0;
		 
		 do {
			 System.out.println("Digite um número: ");
		     numeros = leia.nextInt();
		     
		     if (numeros > 0) {
		    	 soma += numeros;
		     }
		    	 
		     } while (numeros != 0 );
		 
		 
			 System.out.println("A soma dos positivos é:" + soma);
			 leia.close();
		 

  }
}
