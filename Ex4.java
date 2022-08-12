package lista1;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota2 = scan.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		float nota3 = scan.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		float nota4 = scan.nextFloat();
		
		float soma = (nota1+nota2+nota3+nota4);
		
		System.out.println("A média das notas é : "+soma/4);
		
		scan.close();

	}

}
