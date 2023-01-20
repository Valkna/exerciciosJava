package estrutura_sequencial;

public class ex02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais
		 */
		double pi, raio, area;
		pi = 3.14159;
		raio = 5;
		area = pi * Math.pow(raio, 2);
		System.out.printf("A area do circulo é %.4f", area);

	}

}
