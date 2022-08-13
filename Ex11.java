package lista1;

import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a altura: ");
		float altura = scan.nextFloat();
		
		System.out.println("Peso ideal = "+((72.7*altura)-58));
		
		scan.close();

	}

}
