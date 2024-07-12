package Bibliothèque;

public class Utilisateurs {
	
	// Attributs de la classe Utilisateur
	private String nom;
	private String prenom;
	private String id;
	
	//Constructeur de la classe Utilisateurs
	public Utilisateurs(String nom, String prenom, String id) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	// Méthodes getter pour chaque attribut

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getId() {
		return id;
	}
	// Méthode pour afficher les détails de l'utilisateur
    public void afficherDetails() {
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("ID : " + id);
    }
	
	
}
