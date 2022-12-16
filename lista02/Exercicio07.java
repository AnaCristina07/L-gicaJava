package lista02;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe a altura da lata:");
	float vAltura = sc.nextFloat();
	System.out.println("Informe o raio da circunferência da lata:");
	float vRaio = sc.nextFloat();
	float vVolume = (float) ((Math.PI) * (Math.pow(vRaio, 2) * vAltura));
	System.out.println("O volume da lata é: " + vVolume);
	}
}
