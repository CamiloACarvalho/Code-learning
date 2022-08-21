package br.com.fiap;

import	java.util.Scanner;

public class EntradaDeDados 
{

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um número qualquer maior que zero:  ");
		int num01 = sc.nextInt();
		System.out.print("Diginte um outro número qualquer que seja maior que zero: ");
		int num02 = sc.nextInt();
		
		int soma = num01+num02;
		
		if (num01>num02)
		{
			int dif01 = num01-num02;
			System.out.println("A diferença do número maior para o menor é:" + dif01);
		}
		else
		{
			int dif02 = num02-num01;
			System.out.println("A diferença do número maior para o menor é:" + dif02);
		}
		
		int prod = num01*num02;
		System.out.println("O valor do produto entre os números é:" + prod);
		
		int resto = soma % 2;
		
		if (resto == 0)
		{
			System.out.println("A soma dos números é par!");
		}
		else
		{
			System.out.println("A soma dos números é ímpar!");
		}
		
		sc.close();
		
		}
	
}
