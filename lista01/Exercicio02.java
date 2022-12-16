package lista01;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um valor");
		int valor=sc.nextInt();
		int subtracao = valor - 1;
		System.out.println("O valor antecessor e: " + subtracao);
}
}