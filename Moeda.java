package exercicio0603;
import java.util.Scanner;
public class Moeda {

	public static void main(String[] args) {
	
       double R, Ro;
	  
		
	   Scanner ler = new Scanner(System.in);
	   
	   System.out.print("Quantos Reais voce gostaria de converter para Rial omanense: ");
		R = ler.nextDouble();
		
		Ro = R * 12.82 ;
		
		 System.out.println("Voce tera " + Ro + " Rial omanense.");
		

	}

}
