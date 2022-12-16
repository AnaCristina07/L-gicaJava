package lista02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	   System.out.println("Informe o tempo gasto na viagem em horas: ");
	   float Temp = sc.nextFloat();
	   System.out.println("Informe a velocidade média em KM: ");
	   float VelMedia = sc.nextFloat();
	   float Distancia = Temp * VelMedia;
	   float Consumo = Distancia /12;
	   System.out.println("A distancia percorida foi de: " + Distancia);
	   System.out.println("O consumo foi de: " + Consumo);
	}

}
