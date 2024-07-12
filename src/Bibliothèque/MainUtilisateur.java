package Bibliothèque;

public class MainUtilisateur {
    public static void main(String[] args) {
        // Création d'une instance de Utilisateur
        Utilisateurs utilisateur = new Utilisateurs("Dupont", "Jean", "U001");

        // Affichage des détails de l'utilisateur
        utilisateur.afficherDetails();
    }
}

