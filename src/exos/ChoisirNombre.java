package exos;

import java.util.Random;
import java.util.Scanner;

public class ChoisirNombre {
	
	static final Random random = new Random();
	public static void main(String [] args) {
	Scanner saisie = new Scanner(System.in);
	int nessais = 0; //le nombre d'essais de l'utilisateur
	int num1 = -1; // Le nombre deviné (pourquoi -1 !!)
	int nombreMyster = random.nextInt(20);
	while (num1 != nombreMyster) {
		System.out. println ("Saisir un entier entre 0 inclu et 20 exclu : ");
		num1= saisie.nextInt();
		++nessais;
	if (num1 < nombreMyster ) {
		System.out.println("Entier inferieur a x ");
		}
		else if (num1 > nombreMyster) {
			System.out.println("Entier supérier à x ");
		}
		else {
			System.out.println("La partie est finie ");
			
		
	}

	
	}

	
	}
}
