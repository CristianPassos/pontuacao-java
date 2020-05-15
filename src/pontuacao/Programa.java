package pontuacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int qtdCompras, qtdAtrasoCliente, score, ptsFormaPagamento, ptsInadi;
		
		char tipoPagamento;
		
		double ticketMedio, resultTicket;
		
		final double VLRCOMPRA = 3000;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE ");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		
		System.out.printf("Quantas compras o cliente fez no último ano? ");
		qtdCompras = sc.nextInt();
		
		System.out.printf("Qual o ticket médio? ");
		ticketMedio = sc.nextDouble();
		
		System.out.printf("Quantas vezes o cliente atrasou o pagamento? ");
		qtdAtrasoCliente = sc.nextInt();
		
		System.out.printf("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		tipoPagamento = sc.next().charAt(0);
		
		
		resultTicket = ticketMedio * qtdCompras;
		if (qtdCompras <= 0) {
			System.out.printf("Score de volume de compras = 0 pontos");
		}
		else if(resultTicket <= VLRCOMPRA && qtdCompras <= 2) {
			System.out.printf("Score de volume de compras = 20 pontos");
		}else if(resultTicket <= VLRCOMPRA  && qtdCompras > 2) {
			System.out.printf("Score de volume de compras = 40 pontos");
		}
		else {
			System.out.printf("Score de volume de compras = 60 pontos");
		}
		
		if (qtdAtrasoCliente > 1 || qtdCompras == 0) {
			ptsInadi = 0;
		} else if (qtdCompras > 0 && qtdAtrasoCliente >= 1) {
			ptsInadi = 15;
		} else {
			ptsInadi = 30;
		}
		
		if (tipoPagamento == 'D' || tipoPagamento == 'd') {
			ptsFormaPagamento = 5;
		} else {
			ptsFormaPagamento = 10;
		}
		
		System.out.println();
		System.out.println("Score de inadimplência = " + qtdAtrasoCliente + " pontos");
		System.out.println("Score de forma de pagamento " + ptsFormaPagamento);
		System.out.println("Score de inadimplência = " + ptsInadi + " pontos");
	}

}
