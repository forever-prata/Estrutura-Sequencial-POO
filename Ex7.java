package lista1;

import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do lado : ");
		float lado = scan.nextFloat();
		
		System.out.println("A área do quadrado é : "+lado*lado);
		
		scan.close();

	}

}
