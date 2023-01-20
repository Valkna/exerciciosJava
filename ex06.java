package estrutura_sequencial;

public class ex06 {

	public static void main(String[] args) {
		double valorA, valorB, valorC;
		valorA = 3.0;
		valorB = 4.0;
		valorC = 5.2;
		System.out.printf("A área do triângulo retângulo é %.2f%n", valorA * valorC / 2);
		System.out.printf("A área do círculo é %.2f%n", 3.14159 * valorC * valorC);
		System.out.printf("A área do trapézio é %.2f%n", (valorA + valorB) * valorC / 2);
		System.out.printf("A área do quadrado é %.2f%n", (valorB * valorB));
		System.out.printf("A área do retângulo é %.2f%n", (valorA * valorB));

	}

}
/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla
 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
 * e B.
 */