package exercicio0603;
import java.util.Scanner;
public class AreaTriangulo {

	public static void main(String[] args) {
		
		double bas, alt, area;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o tamanho da base do seu triangulo: ");
		bas = ler.nextDouble();
	
		System.out.print("Qual a altura do seu triangulo: ");
		alt = ler.nextDouble();
		
		area = (bas+alt)/2;
		
		System.out.print("Area do seu triangulo é " + area + "².");
	}

}
