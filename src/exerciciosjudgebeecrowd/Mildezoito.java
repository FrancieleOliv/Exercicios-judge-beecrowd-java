package exerciciosjudgebeecrowd;
import java.util.Scanner;

public class Mildezoito {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, quociente, resto, nota;
		x = sc.nextInt();
		System.out.println(x);
		
		resto = x;
		nota = 100;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ "+ nota + ",00");
		resto = resto % nota;
		
		nota = 50;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ "+ nota + ",00");
		resto = resto % nota;
		
		nota = 20;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ "+ nota + ",00");
		resto = resto % nota;
		
		nota = 10;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ "+ nota + ",00");
		resto = resto % nota;
		
		nota = 5;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ "+ nota + ",00");
		resto = resto % nota;
		
		nota = 2;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ "+ nota + ",00");
		resto = resto % nota;
		
		System.out.println(resto + " nota(s) de R$ 1,00");
				
		sc.close();
	}

}
