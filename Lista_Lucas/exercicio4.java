import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		//Declaração das variaveis
		double raio,per,area;
		double pi = 3.14;
		
		
		//Dados do usuário
		System.out.println("Digite o raio do círculo:");
		raio=teclado.nextDouble();
		
		
		//calculo
		per= 2*pi*raio;
		area= pi*raio*raio;
		
		System.out.printf("O perimetro do círculo %.1f\n:",per);
		System.out.printf("A área do círculo %.1f:",area);
		
		
		
		teclado.close();

	}

}
