package ExerciciosVetor;

import java.util.Scanner;

public class ExercicioNome2 {

		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Informe o seu nome: ");
				 String [] nome = new String [5];
				 nome [i] = sc.next();
			}
		}		
}

