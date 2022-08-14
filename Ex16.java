package lista1;

import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a Área (em m²) a ser pintada : ");
		float area = scan.nextFloat();
		
		int litros = (int) (area/6);

		if ((area%6)>0) {
			
			litros = litros+1;
			
		}
		
		int latas = litros/18;
		
		if ((litros%18)>0) {
			
			latas = latas+1;
			
		}
		
		int galoes = (int) (litros/3.6);
		
		if ((litros%3.6)>0) {
			
			galoes = galoes+1;
			
		}
		
		System.out.println("Latas necessárias : "+latas);
		System.out.println("Galões necessárias : "+galoes);
		System.out.println("Valor total Latas = R$"+latas*80+",00");
		System.out.println("Valor total Galões = R$"+galoes*25+",00");
		
		scan.close();
		
	}

}
