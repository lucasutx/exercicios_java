import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		//Declaração das variavéis
		double a,b;
		double c=0;
		double d=0;
		
		//Lendo os dados do usuário
		System.out.println("Digite o valor de A:");
		a=teclado.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b=teclado.nextDouble();
		
		//Atribuições
		d=b;
		c=a;
		a=d;
		b=c;
		
		//Saída
		System.out.printf("O valor de A agora é: %.1f\n",a);
		System.out.printf("O valor de B agora é: %.1f\n",b);
		
		
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
