package lista1;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Digite a altura: ");
		float altura = scan.nextFloat();
		
		System.out.println("Peso ideal para um homem = "+((72.7*altura)-58));
		System.out.println("Peso ideal para uma mulher = "+((62.1*altura)-44.7));
		
		scan.close();
		
		
		
	}
}
