package Universite;


import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	
	private String nom;
	private String prenom;
	private String matricule;
	private List<Cours> cours;
	
	public Etudiant(String nom, String prenom, String matricule) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.cours = new ArrayList<>();
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getMatricule() {
		return matricule;
	}
	public void inscrireCours(Cours c) {
		
		this.cours.add(c);
		System.out.println("L'étudiant " + nom + " est inscrit au cours " + c.getNom() + ".");
	}
	public void desincrireCours(Cours c) {
		this.cours.remove(c);
		System.out.println("L'étudiant " + nom + " est désinscrit du cours " + c.getNom() + ".");
	}
	public void InfoEtudiant() {
		System.out.println("Nom étudiant : " + this.nom);
		System.out.println("Prenom étudiant : " + this.prenom);
		System.out.println("Matricule étudiant : " + this.matricule);
		for (Cours c : cours) {
            System.out.println("- " + c.getNom() + " (Code : " + c.getCode() + ", Crédits : " + c.getCredits() + ")");
        }
    }

}

	


