package algorithmie;

public class AffichageInverse {	
	
	public static void main(String[] args) {
		//Déclaration du tableau
		int [] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		//Afficher l'ensemble des éléments des tableau
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		////Afficher l'ensemble des éléments des tableau inversé
		 for (int i = array.length - 1; i >= 0; i--) {
	            System.out.println(array[i]);
	        }
		 
		 //Copy de la tableau array
		 int[] arrayCopy = array;
		 
		 for(int i=0; i<arrayCopy.length;i++) {
				System.out.println(arrayCopy[i]);
			}
	
	}
}
