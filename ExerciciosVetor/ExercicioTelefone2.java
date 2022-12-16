package ExerciciosVetor;

import java.util.Scanner;

public class ExercicioTelefone2 {


	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Informe o seu telefone: ");
			 String [] telefone = new String[5];
			telefone[i] = sc.next();
		}
		
	}		
}