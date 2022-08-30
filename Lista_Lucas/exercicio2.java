import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//Declaração das variavéis
		double salarioMinimo,custo,desc,total;
		int kilowt;
		
		//Leituta dos dados
		System.out.println("Digite o salário mínimo:");
		salarioMinimo=teclado.nextDouble();
		System.out.println("Digite o quanto você usou de kw:");
		kilowt=teclado.nextInt();
		//calculo 
		custo=(salarioMinimo/7)/100;
		total=custo*kilowt;
		desc = total-(total*0.10);
		
		
		
		System.out.println("O valor de reais por kilowatt $"+custo); 
		System.out.println("O valor em reais a ser pago é $"+total);
		System.out.println("O valor com desconto é $"+desc);
		
		
		
		teclado.close();
	}

}
