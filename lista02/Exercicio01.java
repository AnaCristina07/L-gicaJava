package lista02;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite sua idade em anos: ");
	int ano = sc.nextInt();
	System.out.println("Digite a quantidade de meses que passou do seu aniversário: ");
	int mes = sc.nextInt();
	System.out.println("Digite a quantidade de dias que passou do seu mesversário: ");
	int dia = sc.nextInt();
	int diasvividos = ano*365*mes*30*dia;
	System.out.println("A quantidade de dias vividos corresponde a :" + diasvividos);

	}
}