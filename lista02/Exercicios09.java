package lista02;

import java.util.Scanner;

public class Exercicios09 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Informe a valor base do servi�o: ");
		float valor = sc.nextFloat();
		System.out.println("Informe a quantidade de horas de servi�o: ");
		float horas = sc.nextFloat();
		System.out.println("Informe o percentual de taxa: ");
		float taxa = sc.nextFloat();
		float valorFinal =valor+(valor*(taxa/100)*horas);
		System.out.println("O valor final, ap�s as taxas de atrasos, � de:" + valorFinal);
	}
}