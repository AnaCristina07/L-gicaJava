package lista03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Qual a cota��o atual do d�lar? ");
    float cotDolar = sc.nextFloat();
	System.out.println("Quantos D�lares voce possui? ");
	float qtdDolares = sc.nextFloat();
	float Conversao = qtdDolares*cotDolar;
	System.out.println("O valor da convers�o em reais �: R$" + Conversao);
	}
}