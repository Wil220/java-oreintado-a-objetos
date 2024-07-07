package aula04;

import java.util.Scanner;

public class VerificarNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota do aluno: ");
		double nota = sc.nextDouble();

		if(nota >= 7) {
			System.out.println("O aluno está aprovado!! ");		
		}
		else if(nota >= 5) {
			System.out.println("O aluno está em recuperação. ");
		}
		else {
			System.out.println("O aluno está reprovado!! ");
		}
		
		sc.close();
	}
}