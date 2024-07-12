package test;

public class Voiture {
	
	//Déclaration des variables d'état
	private String marque;
	private String couleur;
	private int nombrePlaces;
	private int compteur;
	
	//Constructeur avec argument
	public Voiture(String marque,String couleur,int nombrePlaces ) {
		System.out.println("Construction d'un objet de type voiture");
		this.marque = marque;
		this.couleur = couleur;
		this.nombrePlaces = nombrePlaces;
		this.compteur++;
	}
	
	//Déclaration des méthodes
	
	public void demarrer() {
		System.out.println("Démarrer la voiture");
	}
	public void arreter() {
		System.out.println("arrêt de la voiture");
	}
	public void accelerer() {
		System.out.println("accéleration de la voiture");
	}
	//Déclaration des getters et des setters
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur() {
		this.couleur = couleur;
	}
	public int getnombrePlaces() {
		return nombrePlaces;
	}
	public void setnombrePlaces() {
		this.nombrePlaces = nombrePlaces;
	}
	public int getCompteur() {
		return compteur;
	}
	
}
