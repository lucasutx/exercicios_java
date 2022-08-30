import java.util.Scanner;
/*
 * Lucas Xavier Bitencourt
 * Exercício 1
 */

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Declaração das variáveis 
		int cent,dez,uni,cdu,udc;
		//Pegando os números para conversão
		System.out.println("Digite o número da casa da centena(com 2 zeros):");
		cent=teclado.nextInt();
		
		System.out.println("Digite o número da casa da dezena(com 1 zero):");
		dez=teclado.nextInt();
		
		System.out.println("Digite o número da casa da unidade:");
		uni=teclado.nextInt();
		
		//Transformando os números para CDU
		cdu=cent+dez+uni;
		
		//Cálculos para transformar as casas dos números em unidade
		cent=cdu/100;
		dez=(cdu/10)%10;
		uni = cdu % 10;
		
		//Transformando para UDC
		udc= uni*100 + dez*10 +cent;
		
		System.out.println("O número em invertido é:"+ udc);

		
		teclado.close();

	}

}
