package lista01;

import java.util.Scanner;

public class Exercicio10 {
	
	 public static void main (String[]args) {	 
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o tamanho do lado do quadrado: ");
			int lado = sc.nextInt();
			double area = Math.pow(lado, 2);
			System.out.println("A Area do quadrado é: " + area);
		}
}
