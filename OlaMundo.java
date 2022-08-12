package teste;
import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Informe um Numero(int): ");
		int numI = scan.nextInt();
		System.out.println("NumI: "+numI);
		
		System.out.print("Informe um Numero(float): ");
		float numF = scan.nextFloat();
		System.out.println("NumF: "+numF);
		
		System.out.print("Informe um Numero(double): ");
		double numD = scan.nextDouble();
		System.out.println("NumD: "+numD);
		
		scan.nextLine();
		
		System.out.print("Informe um texto: ");
		String texto = scan.nextLine();
		System.out.println(texto);
		
		System.out.print("Informe um caracter: ");
		char letra = scan.nextLine().charAt(0);
		System.out.println(letra);
		
		scan.close();
	}

}
