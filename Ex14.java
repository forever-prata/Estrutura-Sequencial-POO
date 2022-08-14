package lista1;

import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o quanto você ganha por hora : ");
		float ganhoPorHora = scan.nextFloat();
		
		System.out.println("Digite quantas horas foram trabalhadas : ");
		int horas = scan.nextInt();
		
		float bruto = ganhoPorHora*horas;
		
		double ir = bruto * 0.11;
		double inss = bruto * 0.08;
		double sindicato = bruto * 0.05;
		
		double liquido = bruto -ir-inss-sindicato;
		
		System.out.println("Salario liquido = R$"+liquido);
		System.out.println("---------------------------------");
		System.out.println("Pago ao Imposto de Renda: R$"+ir);
		System.out.println("Pago ao INSS: R$"+inss);
		System.out.println("Pago ao Sindicato: R$"+sindicato);
		
		scan.close();
		
	}

}
