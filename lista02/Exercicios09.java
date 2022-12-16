package lista02;

import java.util.Scanner;

public class Exercicios09 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Informe a valor base do serviço: ");
		float valor = sc.nextFloat();
		System.out.println("Informe a quantidade de horas de serviço: ");
		float horas = sc.nextFloat();
		System.out.println("Informe o percentual de taxa: ");
		float taxa = sc.nextFloat();
		float valorFinal =valor+(valor*(taxa/100)*horas);
		System.out.println("O valor final, após as taxas de atrasos, é de:" + valorFinal);
	}
}