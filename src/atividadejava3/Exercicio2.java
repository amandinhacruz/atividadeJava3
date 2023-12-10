package atividadejava3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// ler 10 números e identificar quantos são pares e quantos são impares
		
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		int numerosPares = 0;
		int numerosImpares = 0;
		
		
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Digite o: " +i+ "º número");
			
			 numero = leia.nextInt();
			
			if (numero %2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}
		
		System.out.println("Números pares: " + numerosPares);
		System.out.println("Números ímpares: " + numerosImpares);
		
		
		

	}

}
