package lista03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite aqui o s�lario mensal");
	float SM = sc.nextFloat();
	System.out.println("Digite aqui o valor Percentual do Reajuste em %:");
	float PR = sc.nextFloat();
	float NS = SM + (PR/100) * SM;
	System.out.println("Novo Sal�rio R$ " + NS);
	}
}
