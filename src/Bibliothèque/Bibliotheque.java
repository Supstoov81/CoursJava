package Bibliothèque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	// Attributs de la classe Bibliotheque
	private List<Livre> livres;
	private List<Utilisateurs> users;
	
	// Constructeur de la classe Bibliotheque
	public Bibliotheque() {
		livres = new ArrayList<>();    // Initialisation de la liste de livres
        users = new ArrayList<>(); 
	}
	// Méthode pour ajouter un livre à la bibliothèque
	public void ajouterLivre(Livre livre) {
		this.livres.add(livre); // Ajoute le livre à la liste des livres
		System.out.println("Le livre " + livre.getTitre() + " a été ajouté à la bibliothèque.");
	}
	// Méthode pour enregistrer un utilisateur
	public void enregistrerUtilisateur(Utilisateurs utilisateur) {
		this.users.add(utilisateur);System.out.println("L'utilisateur " + utilisateur.getNom() + " a été enregistré.");
	}
	 // Méthode pour permettre à un utilisateur d'emprunter un livre
    public void emprunterLivre(String isbn, String userId) {
        Livre livre = trouverLivreParIsbn(isbn); // Trouve le livre par son ISBN
        if (livre != null && livre.isDisponible()) {
            livre.emprunter();         // Change l'état de disponibilité du livre
            System.out.println("L'utilisateur " + userId + " a emprunté le livre " + livre.getTitre() + ".");
        } else {
            System.out.println("Le livre avec ISBN " + isbn + " n'est pas disponible.");
        }
    }

    // Méthode pour permettre à un utilisateur de retourner un livre
    public void retournerLivre(String isbn) {
        Livre livre = trouverLivreParIsbn(isbn); // Trouve le livre par son ISBN
        if (livre != null && !livre.isDisponible()) {
            livre.retourner();          // Change l'état de disponibilité du livre
            System.out.println("Le livre " + livre.getTitre() + " a été retourné.");
        } else {
            System.out.println("Le livre avec ISBN " + isbn + " n'a pas été emprunté.");
        }
    }

    // Méthode pour trouver un livre par son ISBN
    private Livre trouverLivreParIsbn(String isbn) {
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn)) {
                return livre;           // Retourne le livre trouvé
            }
        }
        return null;                    // Retourne null si aucun livre n'est trouvé
    }

    // Méthode pour afficher tous les livres de la bibliothèque
    public void afficherLivres() {
        System.out.println("Liste des livres dans la bibliothèque :");
        for (Livre livre : livres) {
            livre.afficherDetails();    // Affiche les détails de chaque livre
        }
    }

    // Méthode pour afficher tous les utilisateurs enregistrés
    public void afficherUtilisateurs() {
        System.out.println("Liste des utilisateurs enregistrés :");
        for (Utilisateurs Utilisateurs : users) {
        	Utilisateurs.afficherDetails(); // Affiche les détails de chaque utilisateur
        }
    }
}