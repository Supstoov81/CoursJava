package Bibliothèque;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliothequeGUI extends JFrame {
    private Bibliotheque bibliotheque;
    private JTextField titreField;
    private JTextField auteurField;
    private JTextField isbnField;
    private JTextField nomField;
    private JTextField prenomField;
    private JTextField idField;
    private JTextArea outputArea;

    public BibliothequeGUI() {
        bibliotheque = new Bibliotheque();
        initUI();
    }

    private void initUI() {
        setTitle("Bibliothèque");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Création des panneaux
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Composants pour ajouter des livres
        panel.add(new JLabel("Titre du livre :"));
        titreField = new JTextField();
        panel.add(titreField);

        panel.add(new JLabel("Auteur :"));
        auteurField = new JTextField();
        panel.add(auteurField);

        panel.add(new JLabel("ISBN :"));
        isbnField = new JTextField();
        panel.add(isbnField);

        JButton ajouterLivreButton = new JButton("Ajouter Livre");
        panel.add(ajouterLivreButton);

        // Composants pour ajouter des utilisateurs
        panel.add(new JLabel("Nom de l'utilisateur :"));
        nomField = new JTextField();
        panel.add(nomField);

        panel.add(new JLabel("Prénom :"));
        prenomField = new JTextField();
        panel.add(prenomField);

        panel.add(new JLabel("ID :"));
        idField = new JTextField();
        panel.add(idField);

        JButton ajouterUtilisateurButton = new JButton("Ajouter Utilisateur");
        panel.add(ajouterUtilisateurButton);

        // Composant pour afficher la sortie
        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Ajout des panneaux à la fenêtre
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Ajouter les écouteurs d'action
        ajouterLivreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ajouterLivre();
            }
        });

        ajouterUtilisateurButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ajouterUtilisateur();
            }
        });
    }

    private void ajouterLivre() {
        String titre = titreField.getText();
        String auteur = auteurField.getText();
        String isbn = isbnField.getText();
        Livre livre = new Livre(titre, auteur, isbn);
        bibliotheque.ajouterLivre(livre);
        outputArea.append("Le livre " + titre + " a été ajouté.\n");
        titreField.setText("");
        auteurField.setText("");
        isbnField.setText("");
    }

    private void ajouterUtilisateur() {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String id = idField.getText();
        Utilisateurs utilisateur = new Utilisateurs(nom, prenom, id);
        bibliotheque.enregistrerUtilisateur(utilisateur);
        outputArea.append("L'utilisateur " + nom + " " + prenom + " a été enregistré.\n");
        nomField.setText("");
        prenomField.setText("");
        idField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BibliothequeGUI ex = new BibliothequeGUI();
                ex.setVisible(true);
            }
        });
    }
}

