package lista02;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int vPercDistribuidor = 28;
	int vPercImpostos = 45;
	System.out.println("Informe o valor de custo de fábrica: ");
	float vCustoFabrica = sc.nextFloat();
	float vValorDistribuidor = vCustoFabrica + (vCustoFabrica * vPercDistribuidor / 100);
	float vValorImposto = vCustoFabrica + (vCustoFabrica * vPercImpostos / 100);
	float vCustoConsumidor = vCustoFabrica + vValorDistribuidor + vValorImposto;
	System.out.println("O custo ao consumidor é: " + vCustoConsumidor);	
	}

}
