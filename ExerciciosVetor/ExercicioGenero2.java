package ExerciciosVetor;

import java.util.Scanner;

public class ExercicioGenero2 {
	
	public static void main(String[]args) {
		
		  Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Informe o seu genero: ");
				 String [] genero = new String[5];
				genero[i] = sc.next();
			}
			
	}

}
