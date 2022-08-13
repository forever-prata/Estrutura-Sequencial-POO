package lista1;

import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Farenheit : ");
		float temp = scan.nextFloat();
		
		System.out.println("Temperatura em Celsius: "+((temp-32)/1.8));
		
		scan.close();
		

	}

}
