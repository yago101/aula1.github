package app;

import java.util.Locale;
import java.util.Scanner;

/* Projeto criado com o intuito de 
 * aprimorar os conhecimentos com Git e GitHub.
 * O mesmo consiste em receber N valores e devolver 
 * a média. Também vai informar se o valor está acima 
 * ou abaixo da média padrão informada pelo usuário. 
 */


public class Program{
	
	public static void main(String[]args) {
		
		double totalNotas = 0, mediaNotas, mediaPadrao;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner (System.in);
		
		System.out.print("Qual é o valor da média padrão ? ");
		mediaPadrao = tc.nextDouble();
		
		System.out.print("\nDigite a quantidade de notas: ");
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
		
		//calculando médiaNotas
		mediaNotas = totalNotas/arrayNotas.length;
		
		/*calculando a diferenca para verificar
		*se a mediaNotas está acima,abaixo ou igual
		* a mediaPadrao
		*/
		double diferenca = mediaNotas-mediaPadrao;
		
		//saída 
		if(diferenca>0) {
			System.out.printf("%nMédia = %.2f, está %.2f acima da média padrão informada", mediaNotas,diferenca);
		}else if(diferenca<0) {
			System.out.printf("%nMédia = %.2f, está %.2f abaixo da média padrão informada.", mediaNotas,diferenca);
		}else {
			System.out.printf("%nMédia = %.2f, está igual a média padrão informada", mediaNotas);
		}
		
		tc.close();
	}
}