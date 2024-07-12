package Bibliothèque;

public class Livre {
	
	// Attributs de la classe Livre
	private String titre;
	private String auteur;
	private String isbn;
	private boolean disponible;
	
	// Constructeur de la classe Livre
	public Livre(String titre, String auteur, String isbn) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
		this.disponible = true;
	}
	// Méthodes getter pour chaque attribut
	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public boolean isDisponible() {
		return disponible;
	}
	// Méthode pour emprunter le livre
	public void emprunter() {
		if(disponible) {
			this.disponible = false;
			System.out.println("Le livre " + titre + " a été emprunté.");
		}
		else {
			System.out.println("Le livre " + titre + " n'est pas disponible.");
		}
		
	}
	// Méthode pour retourner le livre
	public void retourner() {
		this.disponible = true;
		System.out.println("Le livre " + titre + " a été retourné.");
	}
	public void afficherDetails() {
		
		System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("ISBN : " + isbn);
        System.out.println("Disponible : " + (disponible ? "Oui" : "Non"));
		
	}
		
}
