import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		
		//Declaração das variaveis
		int min,hora,passados;
		int dia=1440;
		
		//Leitura da dados do usuário
		System.out.println("Digite o valor da hora: ");
		hora=teclado.nextInt();
		
		System.out.println("Digite o valor do minuto:");
		min=teclado.nextInt();
		
		//Transformação das horas em minutos
		hora=(hora*60);
		passados=dia-(hora+min);
		
		System.out.printf("Se passaram do deste o início do dia: %d minutos",dia-passados);
		
		
		
		
		teclado.close();

	}

}
