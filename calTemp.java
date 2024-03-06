package exercicio0603;

import java.util.Scanner;
public class calTemp {
	
	public static void main (String[]arms) {

	Scanner ler = new Scanner(System.in);
	
	float ft,ce;
	
	System.out.print("Qual a temperatura em Fahrenhent's: ");
	ft = ler.nextFloat();
	
	ce = ((ft-32)*5)/9;
	System.out.println(" ");
	System.out.print("Em celsius, a temperatura atual é: "+ce);
	
	}
}
