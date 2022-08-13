package lista1;

import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite um numero inteiro: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		int n2 = scan.nextInt();
		
		System.out.println("Digite um numero float: ");
		float n3 = scan.nextFloat();
		
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: "+(n1*2)*(n2/2));
		
		System.out.println("Soma do triplo do primeiro com o terceiro: "+((n1*3)+n3));
	
		System.out.println("Terceiro elevado ao cubo: "+(n3*n3*n3));
		
		
		scan.close();
		
		
	}

}
