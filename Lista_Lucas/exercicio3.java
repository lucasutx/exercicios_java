import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaração das variáveis
		double base,altura,peri,area,diag;
		
		//Dados do usuário
		System.out.println("Digite a medida da base do retângulo");
		base=teclado.nextDouble();
		
		System.out.println("Digite a medida da altura do retângulo");
		altura=teclado.nextDouble();
		
		//Calculos do perimetro,área e diagonal
		peri=(base*2)+(altura*2);
		area=base*altura;
		diag=Math.sqrt(base*base+altura*altura);
		
		System.out.printf(" Seu perímetro é : %.1f\n",peri);
		
		System.out.printf(" Sua área é : %.1f\n",area);
		
		System.out.printf(" Sua diagonal é : %.1f",diag);
		
		
		
		
		
		
		
		
		
		teclado.close();

	}

}
