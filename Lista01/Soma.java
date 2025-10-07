package prjAula01;

import java.util.Scanner;

public class Soma {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		int valor1, valor2, resultado;
		System.out.println("Entre com o 1o valor:");
		valor1 = ler.nextInt();
		System.out.println("Entre com o 2o valor:");
		valor2 = ler.nextInt();
		resultado = valor1+valor2;
		
		System.out.println("A soma é = "+resultado);
		System.out.println("\nSPFC maior do Brasil S2");
		
	}
}
