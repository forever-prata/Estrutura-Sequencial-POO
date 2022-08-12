package lista1;

import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio de um circulo : ");
		float raio = scan.nextFloat();
		
		System.out.println("A area do circulo e : "+(3.14*(raio*raio)));
		System.out.println("(PI = 3,14)");
		
		scan.close();
		
	}

}
