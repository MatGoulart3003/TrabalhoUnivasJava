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
			 
			System.out.println("Escolha uma das op��es para calcular");
			
			System.out.println("1 - Adi��o");
			
			System.out.println("2 - Subtra��o");
			
			System.out.println("3 - Multiplica��o");

			System.out.println("4 - Divis�o");

			System.out.println("9 - Encerrar");
			
			opcao = read.nextInt();
			 
		 	if (opcao == 1) {
				 
		 		System.out.println("Adi��o");
				System.out.println("======================");
		 		System.out.println("Primeiramente digite o valor de X:");
		 			X = read.nextFloat();
		 		System.out.println("Agora digite o valor de Y:");
		 			Y = read.nextFloat();
		 			result = X+Y;
		 		System.out.println("O valor da soma de X por Y �: "+ result);
		 		

			} else if (opcao == 2 ){
				
				System.out.println("Subtra��o");
				System.out.println("======================");
		 		System.out.println("Primeiramente digite o valor de X:");
		 			X = read.nextFloat();
		 		System.out.println("Agora digite o valor de Y:");
		 			Y = read.nextFloat();
		 			result = X-Y;
		 		System.out.println("O valor da subtra��o de X por Y �: "+ result);
		 		
			} else if (opcao == 3 ){
				
				System.out.println("Multiplica��o");
				System.out.println("======================");
		 		System.out.println("Primeiramente digite o valor de X:");
		 			X = read.nextFloat();
		 		System.out.println("Agora digite o valor de Y:");
		 			Y = read.nextFloat();
		 			result = X*Y;
		 		System.out.println("O valor da multiplica��o de X por Y �: "+ result);
		 		
			} else if (opcao == 4 ) {
				
				System.out.println("Divis�o");
				System.out.println("======================");
		 		System.out.println("Primeiramente digite o valor de X:");
		 		X = read.nextFloat();
		 		System.out.println("Agora digite o valor de Y:");
		 		Y = read.nextFloat();
		 		result = X/Y;
		 		System.out.println("O valor da divis�o de X por Y �: "+ result);
		 					
			} else if (opcao == 9 ) {
				
				System.out.println("Encerrado");
				break;
			} else {
			
				
				System.out.println("Op��o inv�lida");
				
			}
					
		} while (true); 
	
	read.close();
			 
	}
	

	} 