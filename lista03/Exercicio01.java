package lista03;

import java.util.Scanner;

public class Exercicio01 {
	
	 public static void main (String[]args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite 04 VALORES A SEREM SOMADOS E MULTIPLICADOS ENTRE SI: ");
		 int A = sc.nextInt();
		 int B = sc.nextInt();
		 int C = sc.nextInt();
		 int D = sc.nextInt();
		  System.out.println("A soma de A com B �:" + A+B);
		  System.out.println("A MULTIPLICACAO de A com B �:" + A*B);
		  System.out.println("A soma de A com C �:" + A+C);
		  System.out.println("A MULTIPLICACAO de A com C �:" + A*C);
		  System.out.println("A SOMA de A com D �:" + A+D);
		  System.out.println("A MULTIPLICACAO de A com D �:" + A*D);
		  System.out.println("A soma de B com C �:" + B+C);
		  System.out.println("A multiplicacao de B com C �:" + B*C);
		  System.out.println("A SOMA de B com D �:" + B+D);
		  System.out.println("A MULTIPLICACAO de B com D �:" + B*D);
		  System.out.println("A SOMA de C com D �:" + C+D);
		  System.out.println("A MULTIPLICACAO de C com D �:" + C*D);
	 }

}
