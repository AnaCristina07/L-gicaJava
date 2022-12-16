package lista02;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a quatidade de eleitores de um municipio:");
	int quantidadeEleitores = sc.nextInt();
	System.out.println("Digite a quatidade de votos brancos de um municipio:");
	float quantidadeVotosBrancos = sc.nextInt();	
	System.out.println("Digite a quatidade de votos nulos de um municipio:");
	float quantidadeVotosnulo = sc.nextInt();
	System.out.println("Digite a quatidade de votos válidos de um municipio:");
	float quantidadeVotosValidos = sc.nextInt();
	float porcentagemVotosBrancos = quantidadeVotosBrancos/quantidadeEleitores*100;
	float porcentagemVotosNulos = quantidadeVotosnulo/quantidadeEleitores*100;
    float porcentagemVotosValidos = quantidadeVotosValidos/quantidadeEleitores*100;
    System.out.println("A porcentagem de votos brancos corresponde a :" + porcentagemVotosBrancos);
    System.out.println("A porcentagem de votos nulos corresponde a :" + porcentagemVotosNulos);
    System.out.println("A porcentagem de votos válidos corresponde a :" + porcentagemVotosValidos);  
	}

}
