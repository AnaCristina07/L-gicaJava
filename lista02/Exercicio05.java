package lista02;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a temperatura em Cº: ");
	float celsius = sc.nextFloat();
	float fahrenheit = (9*celsius + 160) / 5;
	System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	}

}
