package Bibliothèque;

public class MainBiblio {
    public static void main(String[] args) {
        // Création de la bibliothèque
        Bibliotheque bibliotheque = new Bibliotheque();

        // Création de quelques livres
        Livre livre1 = new Livre("Les Misérables", "Victor Hugo", "123456789");
        Livre livre2 = new Livre("1984", "George Orwell", "987654321");

        // Création de quelques utilisateurs
        Utilisateurs utilisateur1 = new Utilisateurs("Dupont", "Jean", "U001");
        Utilisateurs utilisateur2 = new Utilisateurs("Durand", "Marie", "U002");

        // Ajout des livres à la bibliothèque
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);

        // Enregistrement des utilisateurs
        bibliotheque.enregistrerUtilisateur(utilisateur1);
        bibliotheque.enregistrerUtilisateur(utilisateur2);

        // Affichage des livres et des utilisateurs
        bibliotheque.afficherLivres();
        bibliotheque.afficherUtilisateurs();

        // Un utilisateur emprunte un livre
        bibliotheque.emprunterLivre("123456789", "U001");

        // Affichage des livres après emprunt
        bibliotheque.afficherLivres();

        // L'utilisateur retourne le livre
        bibliotheque.retournerLivre("123456789");

        // Affichage des livres après retour
        bibliotheque.afficherLivres();
    }
}
