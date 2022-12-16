package lista03;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Qtd de Votos Validos Para Candidato A:");
	   int A = sc.nextInt();
	   System.out.println("Qtd de Votos Validos Para Candidato B:");
	   int B = sc.nextInt();
	   System.out.println("Qtd de Votos Validos Para Candidato C:");
	   int C = sc.nextInt();
	   System.out.println("Qtd de Votos Nulos:");
	   int votosNulos = sc.nextInt();
	   System.out.println("Qtd de Votos em Branco:");
	   int votosBrancos = sc.nextInt();

	   int votosValidos = A + B + C;
	   int totalEleitores = votosValidos + votosNulos + votosBrancos;

	   float percTotalValido = (votosValidos * 100) / totalEleitores;
	   float percValidoA = (A * 100) / totalEleitores;
	   float percValidoB = (B * 100) / totalEleitores;
	   float percValidoC = (C * 100) / totalEleitores;
	   float percNulo = (votosNulos * 100) / totalEleitores;
	   float percBranco = (votosBrancos * 100) / totalEleitores;
	   
	   System.out.println("Total de Eleitores:  " + totalEleitores);
	   System.out.println("Porcentagem total de votos válidos: " + percTotalValido);
	   System.out.println("Porcentagem de votos válidos do candidato A: " + percValidoA + "%");
	   System.out.println("Porcentagem de votos válidos do candidato B: " + percValidoB + "%");
	   System.out.println("Porcentagem de votos válidos do candidato C: " + percValidoC + "%");
	   System.out.println("Porcentagem de votos brancos: " + percBranco + "%");
	   System.out.println("Porcentagem de votos nulos: " + percNulo + "%");
	}
}
