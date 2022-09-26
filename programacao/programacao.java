package programacao;

import java.util.Scanner;

public class programacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner ler= new Scanner(System.in);
	int r,a;
	
	System.out.printf("Informe o raio:");
	r= ler.nextInt();
	System.out.printf("Informe a altura:");
	a= ler.nextInt();
	if(r>0)
		{System.out.printf("O volume e: %.2f\n ",3.14159*r*r*a);
		
		}
	
	
	
	
	}
}
