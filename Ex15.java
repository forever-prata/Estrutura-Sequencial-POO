package lista1;

import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a Área (em m²) a ser pintada : ");
		float area = scan.nextFloat();
		
		int litros = (int) (area/3);

		if ((area%3)>0) {
			
			litros = litros+1;
			
		}
		
		int latas = litros/18;
		
		if ((litros%18)>0) {
			
			latas = latas+1;
			
		}
		
		System.out.println("Latas necessárias : "+latas);
		System.out.println("Valor total = R$"+latas*80+",00");
		
		scan.close();
		
	}

}
