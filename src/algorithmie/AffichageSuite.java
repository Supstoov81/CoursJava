package algorithmie;

public class AffichageSuite {
	public static void main(String[] args) {
		//Affichage de tous les nombres de 1 à 10
		System.out.println("Affichage de tous les nombres de 1 à 10");
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
			
		}
		
		// Ajouter une ligne vide entre les deux blocs d'exécution
        System.out.println("\n");
		
		//Affichage de tous les nombres paires entre 0 et 20
		System.out.println("Affichage de tous les nombres paires entre 0 et 20:");
		for(int i = 0;i<=20;i++) {
			if(i%2==0)
			System.out.println(i);
		}
		
		// Ajouter une ligne vide entre les deux blocs d'exécution
        System.out.println("\n");
		
		//Affichage de tous les nombres impaires entre 0 et 9
		System.out.println("Affichage de tous les nombres impaires entre 0 et 9:");
		for(int i = 0;i<=9;i++) {
			if(i%2!=0)
			System.out.println(i);
		}
	}
}

