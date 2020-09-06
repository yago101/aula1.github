package app;

import java.util.Locale;
import java.util.Scanner;

/* Projeto criado com o intuito de 
 * aprimorar os conhecimentos com Git e GitHub.
 * O mesmo consiste em receber N valores e devolver 
 * a média. 
 */


public class Program{
	
	public static void main(String[]args) {
		
		double totalNotas = 0, media;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner (System.in);
		
		
		System.out.println("Digite a quantidade de notas: ");
		int n = tc.nextInt();
		
		double[] arrayNotas = new double[n];
		
		
		//laço for para capturar as notas 
		for(int i = 0;i<arrayNotas.length;i++) {
			System.out.printf("Digite a %d nota: ", i+1);
			arrayNotas[i] = tc.nextDouble();
		}
		
		//laço for para percorrer o arrayNotas e obter o valor totalNotas
		for(int i = 0 ;i<arrayNotas.length;i++) {
			totalNotas += arrayNotas[i];
		}
		
		media = totalNotas/arrayNotas.length;
		
		//saída 
		System.out.printf("%nMédia = %.2f", media);
		
		tc.close();
	}
}