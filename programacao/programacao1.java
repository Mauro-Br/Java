package programacao;

import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num;
		Scanner ler= new Scanner(System.in);
		
		System.out.printf("Informe o numero:");
		num = ler.nextInt();
			
		if (num%2 ==0 )
		{
			System.out.printf("O numero é par" );
		}

		else
		{
			System.out.printf("O numero é impar" );
		}	
	}
}
