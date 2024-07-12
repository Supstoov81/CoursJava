package Universite;

public class Cours {
	
	private String nom;
	private String code;
	private int credits;
	
	//Constructeur
	public Cours(String nom,String code,int credits) {
		this.nom = nom;
		this.code = code;
		this.credits = credits;
	}

	public String getNom() {
		return nom;
	}

	public String getCode() {
		return code;
	}

	public int getCredits() {
		return credits;
	}
	
	
	
	
}
