
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new  Scanner(System.in);
		
		//Declaração das variaveis
		double razao,ptermo,quintotermo;
		int numerot=5;
		int cons=1;
		
		//Leitura de dados do usuário
		System.out.println("Digite a razão da PA:");
		razao=teclado.nextDouble();
		
		System.out.println("Digite o primeiro termo da PA:");
		ptermo=teclado.nextDouble();
		
		//Equação da PG
		quintotermo = ptermo*Math.pow(razao, numerot-cons);
		
		System.out.printf("O décimo termo é: %.0f\n",quintotermo);
		
		
		
		
		
		teclado.close();

	}

}