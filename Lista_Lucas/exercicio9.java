import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaração das variaveis
		double numerador,denominador,transfor;
		
		
		//Leitura de dados do usuário
		System.out.println("Digite o numerador da fração:");
		numerador=teclado.nextDouble();

		System.out.println("Digite o denominador da fração:");
		denominador=teclado.nextDouble();
		
		
		//Equação para transformação em fração
		transfor=numerador/denominador;
		
		System.out.printf("O numero em decimal é: %.3f",transfor);

		
		
		
		teclado.close();

	}

}
