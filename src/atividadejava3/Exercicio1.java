package atividadejava3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// leia 2 número, o numero 1 < numero2
		// caso contrario deve ser exibido uma mensagem informando invalido
		// mostre na tela todos os numeros que sao multipolos de 3 e 5
		
		int num1, num2; 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digete o segundo número: ");
		num2 = leia.nextInt();
		
		 
		
		if (num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				if (i %3 == 0 && i %5 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo invalido");
		}
		
	}

}
