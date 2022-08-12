package lista1;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho em Metros : ");
		float metros = scan.nextFloat();
		
		System.out.print("O tamanho em Centímetros é : " +(metros*100));
		
		scan.close();

	}

}
