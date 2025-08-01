package exerciciosjudgebeecrowd;

import java.util.Scanner;

public class Miletreze {

	public static void main(String[] args) {
		// Faça um programa que leia três valores e apresente o maior dos três valores lidos
		//seguido da mensagem “eh o maior”.
		//Utilize a fórmula: Maior AB= (a+b+abs(a-b))/2
		//Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
		//Um segundo passo, portanto é necessário para chegar no resultado esperado.
		//Entrada - O arquivo de entrada contém três valores inteiros.
		//Saída - Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
		//Exemplos de Entrada Exemplos de Saída
		//7 14 106
		//106 eh o maior
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, maiorAB, maiorABC;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maiorAB = (a + b + Math.abs(a - b))/2;
		maiorABC = (maiorAB + c + Math.abs(maiorAB - c))/2;
		System.out.println(maiorABC + " eh o maior");
		
		
		sc.close();
		

	}

}
