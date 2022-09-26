package programacao;

import java.util.Scanner;

public class programacao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     int compra;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.printf("O valor da compra:");
		compra = ler.nextInt();	
		if (compra < 50000 )
		{
			System.out.printf("ganhou bonus de 10 porcento %d", compra/100*10 );
		}
		else 
			{
				System.out.printf("ganhou bonus de 15 porcento %d", compra/100*15 );
			}
	}

}
