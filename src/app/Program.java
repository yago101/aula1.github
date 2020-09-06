package app;

import java.util.Locale;
import java.util.Scanner;

/* Projeto criado com o intuito de 
 * aprimorar os conhecimentos com Git e GitHub.
 * O mesmo consiste em receber N valores e devolver 
 * a m�dia. Tamb�m vai informar se o valor est� acima 
 * ou abaixo da m�dia padr�o informada pelo usu�rio. 
 */


public class Program{
	
	public static void main(String[]args) {
		
		double totalNotas = 0, mediaNotas, mediaPadrao;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner (System.in);
		
		System.out.print("Qual � o valor da m�dia padr�o ? ");
		mediaPadrao = tc.nextDouble();
		
		System.out.print("\nDigite a quantidade de notas: ");
		int n = tc.nextInt();
		
		double[] arrayNotas = new double[n];
		
		
		//la�o for para capturar as notas 
		for(int i = 0;i<arrayNotas.length;i++) {
			System.out.printf("Digite a %d nota: ", i+1);
			arrayNotas[i] = tc.nextDouble();
		}
		
		//la�o for para percorrer o arrayNotas e obter o valor totalNotas
		for(int i = 0 ;i<arrayNotas.length;i++) {
			totalNotas += arrayNotas[i];
		}
		
		//calculando m�diaNotas
		mediaNotas = totalNotas/arrayNotas.length;
		
		/*calculando a diferenca para verificar
		*se a mediaNotas est� acima,abaixo ou igual
		* a mediaPadrao
		*/
		double diferenca = mediaNotas-mediaPadrao;
		
		//sa�da 
		if(diferenca>0) {
			System.out.printf("%nM�dia = %.2f, est� %.2f acima da m�dia padr�o informada", mediaNotas,diferenca);
		}else if(diferenca<0) {
			System.out.printf("%nM�dia = %.2f, est� %.2f abaixo da m�dia padr�o informada.", mediaNotas,diferenca);
		}else {
			System.out.printf("%nM�dia = %.2f, est� igual a m�dia padr�o informada", mediaNotas);
		}
		
		tc.close();
	}
}