package lista02;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu sal�rio atual: ");
		float salario = sc.nextFloat();
		System.out.println("Digite o valor do seu reajuste: ");
	    float reajuste = sc.nextFloat();
		float reajustePorcentagem = reajuste/100*salario;
	    float novoSalario = salario+reajustePorcentagem;
	    System.out.println("O novo sal�rio �: " + novoSalario);
	}

}
