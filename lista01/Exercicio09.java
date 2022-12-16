package lista01;

import java.util.Scanner;

public class Exercicio09 {
	
	 public static void main (String[]args) {	 
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite aqui a base do triângulo: ");
			int base = sc.nextInt();
			System.out.println("Digite o Valor da Altura do triângulo: ");
			int altura = sc.nextInt();
			int area = base*altura/2;
			System.out.println("A Area do triângulo é: " + area);

		}
			}

