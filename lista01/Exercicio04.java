package lista01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valor1= sc.nextInt();
		System.out.println("Informe outro valor: ");
		int valor2=sc.nextInt();
		int soma = valor1 + valor2;
		System.out.println("O resultado da soma e: "+ soma);
		
	}
	
}
