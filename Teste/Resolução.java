package Teste;

import java.util.Scanner;

import Entidade.Produto;

public class Resolução {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto(); 
	
	System.out.println(" Qual é nome do Produto : ");
	produto.name = sc.nextLine();
	
	System.out.println("Valor do Produto : ");
	produto.valor = sc.nextDouble();
	
	System.out.println("Quantidade do Produto ? ");
	produto.quantidade = sc.nextInt();
	
	System.out.println("Produto : " + produto.name + " \nValor : " + produto.valor + " \nQuantidade : " + produto.quantidade);
	System.out.println("Valor total é : "+ produto.totalValor());
	}

}
