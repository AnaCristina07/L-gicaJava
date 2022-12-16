package lista01;

import java.util.Scanner;

public class Exercicio08 {
	
     public static void main (String[]args) {	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Valor da Base do Retângulo: ");
	int base = sc.nextInt();
	System.out.println("Digite o Valor da Altura do Retângulo: ");
	int altura = sc.nextInt();
	int area = base*altura;
	System.out.println("A Area do Retângulo é: " + area);

}
	}
