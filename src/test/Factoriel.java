package test;

import java.util.Scanner;

public class Factoriel {
	public static void main(String[] args) {
		
		System.out.println("Entrez un nombre superieur a 0 : ");
		Scanner saisie = new Scanner (System.in);
		
		        int n = saisie.nextInt();
		        
				if(n>0) {
				int facto = 1;
				for(int i = 1;i<=n;i++) {
					facto = facto * i;
				}
				System.out.println("Factoriel de " + n +" est : " + facto);
				
		
				
			}	
	}
}



