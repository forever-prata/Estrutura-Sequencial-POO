package lista1;

import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de peixe: ");
		int peso = scan.nextInt();
		
		int excesso = 0;
		int multa = 0;
		
		if (peso >= 50) {
			
			excesso = (peso-50);
			multa = (excesso*4);
			
		}
		
		System.out.println("Excedente : "+excesso);
		System.out.println("Multa : "+multa);
		
		scan.close();

	}

}
