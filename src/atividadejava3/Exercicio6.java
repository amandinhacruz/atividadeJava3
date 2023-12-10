package atividadejava3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeros;
		 int multiplos = 0;
		 int contador = 0;
		 float media;
		 
		 do {
			 System.out.println("Digite um número: ");
		     numeros = leia.nextInt();
		     
		     if (numeros %3 == 0 && numeros !=0) {
		    	 multiplos += numeros;
		    	 contador++;
		     }
		    	 
		     } while (numeros != 0 );
		 
		     media = (float)multiplos/contador;
			 System.out.println("A média de todos os números múltiplos de 3 é: " + media);
			 leia.close();

	}

}
