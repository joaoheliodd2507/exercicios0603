package exercicio0603;
import java.util.Scanner;

public class Calkm {

	public static void main(String[] args) {
		
		float vlitro, dis, con, vt, Ctg;
		
		Scanner ler = new Scanner(System.in);
				
				System.out.println("Qual o preço do litro da gasolina?");
				vlitro = ler.nextFloat();
				
				System.out.println("Quantos Km foram percorridos?");
				dis = ler.nextFloat();
				
                System.out.println("Quantos Km seu veiculo faz por litro de combustivel ?");
                con = ler.nextFloat();
                
                Ctg = dis / con;
                vt = Ctg * vlitro;
                
                System.out.println(" ");
                System.out.println("O consumo de gasolina foi de "+Ctg+"litros");
                System.out.print("O valor total gasto é R$ "+vt);
	}

}
