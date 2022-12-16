package lista03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor A: ");
		int vA = sc.nextInt();
		System.out.println("Informe o valor B: ");
		int vB = sc.nextInt();
		System.out.println("Informe o valor C: ");
		int vC = sc.nextInt();
		float resultado = vA*vA + vB*vB + vC*vC;
		System.out.println("O resultado é:" + resultado);
	}
}