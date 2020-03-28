package br.edu.univas.main;

import java.util.Scanner;

public class TrabalhoMateusGoulart {
	
	public static void main(String[] args) {
		
		 Scanner read = new Scanner(System.in);	
		 
		 int opcao ;
		 float X;
		 float Y;
		 float result;
		 
		 
		 do {
			 
			System.out.println("Escolha uma das opções para calcular");
			
			System.out.println("1 - Adição");
			
			System.out.println("2 - Subtração");
			
			System.out.println("3 - Multiplicação");

			System.out.println("4 - Divisão");

			System.out.println("9 - Encerrar");
			
			opcao = read.nextInt();
			 
		 	if (opcao == 1) {
				 
		 		System.out.println("Adição");
				System.out.println("======================");
		 		System.out.println("Primeiramente digite o valor de X:");
		 			X = read.nextFloat();
		 		System.out.println("Agora digite o valor de Y:");
		 			Y = read.nextFloat();
		 			result = X+Y;
		 		System.out.println("O valor da soma de X por Y é: "+ result);
		 		

			} else if (opcao == 2 ){
				
				System.out.println("Subtração");
				System.out.println("======================");
		 		System.out.println("Primeiramente digite o valor de X:");
		 			X = read.nextFloat();
		 		System.out.println("Agora digite o valor de Y:");
		 			Y = read.nextFloat();
		 			result = X-Y;
		 		System.out.println("O valor da subtração de X por Y é: "+ result);
		 		
			} else if (opcao == 3 ){
				
				System.out.println("Multiplicação");
				System.out.println("======================");
		 		System.out.println("Primeiramente digite o valor de X:");
		 			X = read.nextFloat();
		 		System.out.println("Agora digite o valor de Y:");
		 			Y = read.nextFloat();
		 			result = X*Y;
		 		System.out.println("O valor da multiplicação de X por Y é: "+ result);
		 		
			} else if (opcao == 4 ) {
				
				System.out.println("Divisão");
				System.out.println("======================");
		 		System.out.println("Primeiramente digite o valor de X:");
		 		X = read.nextFloat();
		 		System.out.println("Agora digite o valor de Y:");
		 		Y = read.nextFloat();
		 		result = X/Y;
		 		System.out.println("O valor da divisão de X por Y é: "+ result);
		 					
			} else if (opcao == 9 ) {
				
				System.out.println("Encerrado");
				break;
			} else {
			
				
				System.out.println("Opção inválida");
				
			}
					
		} while (true); 
	
	read.close();
			 
	}
	

	} 