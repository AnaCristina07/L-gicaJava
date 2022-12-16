package lista03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Quanto está o dolar atualmente?");
    float cotDolar = sc.nextFloat();
	System.out.println("Quantos dólares voce possui?");
	float qtdDolar = sc.nextFloat();
	float Conversao = qtdDolar/cotDolar;
	System.out.println("Os Dólares equivalem á: " + Conversao);
	}
}
