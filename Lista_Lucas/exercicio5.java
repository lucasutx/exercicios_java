import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaração das variaveis
		double cat1,cat2,hipo;
		
		//Dados do usuário
		System.out.println("Digite o valor do cateto adjacente");
		cat1=teclado.nextDouble();
		
		System.out.println("Digite o valor do cateto oposto");
		cat2=teclado.nextDouble();
		
		
		//calculo
		hipo=Math.sqrt(cat1*cat1+cat2*cat2);
		
		System.out.printf("Digite o valor da hipotenusa é %.1f\n",hipo);
		
		
		
		teclado.close();

	}

}
