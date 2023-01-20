package estrutura_sequencial;

public class ex05 {

	public static void main(String[] args) {
		int cod1, cod2, quantidade1, quantidade2;
		float valorUnid1, valorUnid2, total;
		cod1 = 01;
		cod2 = 02;
		quantidade1 = 100;
		quantidade2 = 20;
		valorUnid1 = 5;
		valorUnid2 = 8;
		total = valorUnid1*quantidade1 + valorUnid2*quantidade2;
		System.out.println("Descrição do pedido: " + "O item de código " + cod1 + " são " + quantidade1 + " unidades. " + 
		"O item de código " + cod2 + " são " + quantidade2 + " unidades.");
		System.out.printf("O valor total a pagar é de R$ " + "%.2f", total);
	}

}
/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 */