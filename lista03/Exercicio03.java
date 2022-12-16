package lista03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número inteiro qualquer: ");
    int A = sc.nextInt();
    System.out.println("Digite outro número inteiro qualquer: ");
    int B = sc.nextInt();
    float valor = (A - B);
    double resultado = Math.pow(valor, 2);
    System.out.println("O quadrado da diferença é " + resultado);
	}

}
