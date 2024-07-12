package exos;

public class Sapin {
    public static void main(String[] args) {
        int hauteur = 5;

        for (int i = 0; i < hauteur; i++) {
            // Espaces avant les étoiles
            for (int j = hauteur - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Étoiles
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            // Nouvelle ligne après chaque rangée d'étoiles
            System.out.println();
        }
    }
}
