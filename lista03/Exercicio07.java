package lista03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe o primeiro valor");
	int valorA = sc.nextInt();
	System.out.println("Informe o segundo valor");
	int valorB = sc.nextInt();
	System.out.println("Informe o terceiro valor");
	int valorC = sc.nextInt();
	float soma = (valorA+valorB+valorC)^2;
	double resultado = Math.pow(soma, 2);
	System.out.println("O resultado final é: " + resultado);
	}

}
