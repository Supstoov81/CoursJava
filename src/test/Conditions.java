package test;

public class Conditions {

	public static void main(String[] args) {
		int[] tab = {25,33,60,45,20};
		//Parcourir le tableau et afficher les valeurs de ses éléments
		for(int i=0;i<tab.length;i++) {
			//sortir de la boucle en arrivant à l'élément en cours sans l'afficher
			if(tab[i]==45) {
				break;
			}
			System.out.println(tab[i]);
		}
	}

}
