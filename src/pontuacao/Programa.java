package pontuacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int qtdCompras, score;
		
		double ticketMedio;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE ");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		
		System.out.printf("Quantas compras o cliente fez no �ltimo ano? ");
		qtdCompras = sc.nextInt();
		
		System.out.printf("Qual o ticket m�dio? ");
		ticketMedio = sc.nextDouble();
	}

}
