package ExerciciosVetor;

import java.util.Scanner;

public class ExercicioIdade2 {
	
	public static void main(String[]args) {
		
     Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Informe a sua idade: ");
			 String [] idade = new String[5];
			idade[i] = sc.next();
		}
		
	}	
	
}


