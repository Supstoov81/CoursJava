package compteBancaire;

public class Compte {
	
	//Déclaration des attributs
	private String numeroDeCompte;
	private double solde;
	private String proprietaire;
	
	 // Constructeur
    public Compte(String numeroDeCompte, String proprietaire, double solde) {
        this.numeroDeCompte = numeroDeCompte;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }
	//Déclaration des méthodes
	public void deposer(double ajout) {
		solde +=ajout;
	}
	
	public void retirer(double debit) {
		solde -=debit;
	}
	public void afficherDetails() {
		System.out.println("Proprietaire : " + this.proprietaire + " avec le numero de compte : " + this.numeroDeCompte + " et le solde : "+ this.solde);
	}
	
	
	
	

}
