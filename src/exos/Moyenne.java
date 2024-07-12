package exos;

import java.util.Scanner;

public class Moyenne {
	
	public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		
		//Demande des nombre entiers n à l’utilisateur
		System.out.println("Entrez un premier nombre entier : ");
		int num1= saisie.nextInt();
		
		System.out.println("Entrez un deuxieme nombre entier : ");
		int num2= saisie.nextInt();
		
		System.out.println("Entrez un troisieme nombre entier : ");
		int num3= saisie.nextInt();
		
		//calcul de la somme
		int somme = num1 + num2 + num3;
		
		//Afficher la somme
		System.out.println("La somme de ces nombres est : " + somme);
		
	    //calcul de la moyenne
		double moyenne = ((num1 + num2 + num3) / 3);
		
		//Afficher la moyenne
		
		System.out.println("La moyenne de ces nombres est : " + moyenne);
		
		
	}

}


