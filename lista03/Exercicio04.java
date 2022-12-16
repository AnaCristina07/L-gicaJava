package lista03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Qual a cotação atual do dólar? ");
    float cotDolar = sc.nextFloat();
	System.out.println("Quantos Dólares voce possui? ");
	float qtdDolares = sc.nextFloat();
	float Conversao = qtdDolares*cotDolar;
	System.out.println("O valor da conversão em reais é: R$" + Conversao);
	}
}