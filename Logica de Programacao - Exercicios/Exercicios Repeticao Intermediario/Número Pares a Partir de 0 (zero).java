/******************************************************************************

Escreva um programa para receber um número inteiro e mostrar
todos os números pares positivos até o número digitado.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, contador;
		
		System.out.print("Digite o numero: ");
		numero = ler.nextInt();
		
		
		for (int i = 0; i <= numero; i+=2){
		    System.out.print(i);
                    
		}
		
	}
}