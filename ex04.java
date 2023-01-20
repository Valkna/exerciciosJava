package estrutura_sequencial;

public class ex04 {

	public static void main(String[] args) {
		int idFunc, dias;
		float horas, valorHora, salario;
		idFunc = 1; //verificar como fazer o zero-padding
		horas = 8;
		valorHora = 10;
		dias = 28;
		salario = (horas*valorHora*dias);
		System.out.printf("O salário mensal do funcionário matrícula " + idFunc + " é " + "%.2f", salario);

	}

}
/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/