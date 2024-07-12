package test;

public class Etudiant {
	
	//Déclaration des variables
	private String nom;
	
	
	//Constructeur avec argument
	Etudiant(String nom) {
		this.nom = nom;
		
	}
	public String getNom() {
		return this.nom;
	}
	public void travailler() {
		if(this.nom == "Bob") {
			System.out.println(this.nom+ " se met au travail !");
		}
	}
	public void seReposer() {
		if(this.nom == "Bob") {
				System.out.println(this.nom+ " se repose");
		}
	}

}
