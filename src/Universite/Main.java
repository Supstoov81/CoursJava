package Universite;

public class Main {
	public static void main(String[] args) {
        // Création de quelques cours
        Cours maths = new Cours("Mathématiques", "MATH101", 3);
        Cours physique = new Cours("Physique", "PHYS101", 4);
        Cours informatique = new Cours("Informatique", "CS101", 5);

        // Création d'un étudiant
        Etudiant etudiant = new Etudiant("Dupont", "Jean", "20230001");

        // Inscription de l'étudiant à quelques cours
        etudiant.inscrireCours(maths);
        etudiant.inscrireCours(physique);
        etudiant.inscrireCours(informatique);

        // Affichage des informations de l'étudiant
        etudiant.InfoEtudiant();

        // Désinscription d'un cours
        etudiant.desincrireCours(physique);

        // Affichage des informations de l'étudiant après désinscription
        etudiant.InfoEtudiant();
    }
}


