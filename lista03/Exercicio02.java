package lista03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva aqui a largura da caixa: ");
		float largura = sc.nextFloat();
		System.out.println("Escreva aqui a altura da caixa: ");
		float altura = sc.nextFloat();
		System.out.println("Escreva aqui o comprimento da caixa: ");
		float comprimento = sc.nextFloat();
		float volume = comprimento*largura*altura;
		System.out.println("O volume da caixa é: " + volume);
	}
}
