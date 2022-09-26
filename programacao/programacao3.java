package programacao;

import java.util.Scanner;

public class programacao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.printf("Informe dois numeros:");
		num1 = ler.nextInt();
		num2 = ler.nextInt();	
		if (num1>num2 )
		{
			System.out.printf("O numero 1 é maior" );
		}
		else 
			System.out.printf("O numero 2 é maior" );
			
		
	}

}
