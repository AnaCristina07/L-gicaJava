package lista01;

import java.util.Scanner;

public class Exercicio08 {
	
     public static void main (String[]args) {	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Valor da Base do Ret�ngulo: ");
	int base = sc.nextInt();
	System.out.println("Digite o Valor da Altura do Ret�ngulo: ");
	int altura = sc.nextInt();
	int area = base*altura;
	System.out.println("A Area do Ret�ngulo �: " + area);

}
	}
