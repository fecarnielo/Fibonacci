package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n1 = 0, n2 = 1, n3 = 0, N;
		
		System.out.println("Digite um número da Sequência de Fibonacci: ");
		N = leitor.nextInt();
		
		while (true) {
			if(n3 >= N) {
				break;
			}else {
				n3 = n2 + n1;
				n1 = n2;
				n2 = n3;
				System.out.print(n3 + " ");
			}
		}
		
			System.out.println();

	        if (N == 0 || N == 1) {
	        	System.out.println ("O número faz parte da sequência de Fibonacci.");
	        }
	        else if (N == n3) {
	        	System.out.println("O número faz parte da sequência de Fibonacci.");
	        }
	        else {
	        	System.out.println("O número digitado não faz parte da sequência de Fibonacci.");
	        }

	   leitor.close();
	}
}



