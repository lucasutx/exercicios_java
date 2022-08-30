import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new  Scanner(System.in);
		
		//Declaração das variaveis
		double razao,ptermo,dectermo;
		int numerot=10;
		
		//Leitura de dados do usuário
		System.out.println("Digite a razão da PA:");
		razao=teclado.nextDouble();
		
		System.out.println("Digite o primeiro termo da PA:");
		ptermo=teclado.nextDouble();
		
		//Equação da PA
		dectermo = ptermo+((numerot-1)*razao);
		
		System.out.printf("O décimo termo é: %.0f\n",dectermo);
		
		
		
		
		
		teclado.close();

	}

}
