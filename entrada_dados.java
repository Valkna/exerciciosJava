package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class entrada_dados {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String x;
		x=sc.next(); //permite ler texto sem espaço
		System.out.println("Você digitou: " + x);
		sc.close(); //encerra a função*/
		
		
		/*Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt(); //permite ler número inteiro
		System.out.println("Você digitou: " + x);
		sc.close();*/
		
		
		/*Locale.setDefault(Locale.US); //para printar como separador ponto. sistema BR printa com vírgula
		Scanner sc = new Scanner(System.in);
		double x;
		x=sc.nextDouble();
		System.out.printf("Você digitou %.2f%n", x);
		sc.close();*/
		
		/*Scanner sc = new Scanner(System.in);
		char x;
		x=sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		sc.close();*/
		
		/*Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		
		x=sc.next();
		y=sc.nextInt(); //declarar cada variável conforme sua tipagem
		z=sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);*/
		
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine(); //colocar um nextLine() a mais para conter a quebra de linha da variável int
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
				

	}

}
