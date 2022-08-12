package lista1;

import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora? ");
		float ganho = scan.nextFloat();
		
		System.out.print("Quantas horas foram trabalhadas? ");
		int horas = scan.nextInt();
		
		System.out.println("Ganho = "+ganho*horas);
		
		scan.close();
	}

}
