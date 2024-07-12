package compteBancaire;

public class mainCompte {
	public static void main(String[] arg) {
		Compte cpt = new Compte("Dupont","F3779477",4000);
		
		
		//Afficher le détail du compte
		cpt.afficherDetails();
		
		//détail du compte après dépôt
		cpt.deposer(1000);
		cpt.afficherDetails();
		
		//Détail du compte après retrait
		cpt.retirer(100);
		cpt.afficherDetails();

	}
}
