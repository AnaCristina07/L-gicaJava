package lista03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Infome o primeiro valor");
	int valorA = sc.nextInt();
	System.out.println("Infome o segundo valor");
	int valorB = sc.nextInt();
	System.out.println("Infome o terceiro valor");
	int valorC = sc.nextInt();
	System.out.println("Infome o quarto valor");
	int valorD = sc.nextInt();
	int produto = valorA + valorC;
	int soma = valorB + valorD;
	System.out.println("O resultado do produto é: " + produto);
	System.out.println("O resultado da soma é: " + soma);
	}
}
