package lista1;

import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite o segundo numero inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("A soma dos numeros é : "+(num1+num2));
		
		scan.close();

	}

}
