package atividadejava3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		int quantidade = 0;
		int menores21 = 0;
		int maiores50 = 0;
		while(quantidade < 11) { // 0 < 11
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			quantidade++; // idade + 1
		
			if (idade < 21 ) {
			menores21++;
		} else if (idade > 50) {
			maiores50++;
		}
		}
			System.out.println("Total de pessoas menores de 21 anos é: " + menores21);
			System.out.println("Total de pessoas maiores de 50 anos é: " + maiores50);
			leia.close();
	
	
	
			
			
				
		
	}
	
}
