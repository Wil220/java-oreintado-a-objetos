package aula05;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
	    int idade = sc.nextInt();
	    
	    if(idade < 18) {
	    	System.out.println("/nVocê é menor de idade...");
	    } else if (idade >= 18 && idade <= 59) {
	    	System.out.println("\nVocê é adulto");
	    } else {
	    	System.out.println("\nVocê é um idoso.");
	    }
		sc.close();
	}
}