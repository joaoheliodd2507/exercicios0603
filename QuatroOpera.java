package exercicio0603;
import java.util.Scanner;
public class QuatroOpera {

	public static void main(String[] args) {
		double a, b, som, sub, mult, div;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual o primeiro valor: ");
		a = ler.nextDouble(); 
		System.out.println("Qual o segundo valor: ");
		b = ler.nextDouble(); 
		
		som = a+b;
		sub = a-b;
		mult = a*b;
		div = a/b;
		
		System.out.println("Em soma: "+som);
		System.out.println("Em subtração: "+sub);
		System.out.println("Em multiplicação: "+mult);
		System.out.println("Em divisão: "+div);
	}

}
