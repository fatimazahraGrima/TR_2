package ma.TR_2.presentation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
    import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class GestionEmployes extends JFrame {

    public GestionEmployes() {
        // Configuration de base de la fenêtre
        setTitle("Gestion des Employés");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // Créer la hiérarchie des employés
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("RAMI (Directeur Général)");
        DefaultMutableTreeNode amali = new DefaultMutableTreeNode("AMALI (Développeur)");
        DefaultMutableTreeNode saddik = new DefaultMutableTreeNode("SADDIK (Manager)");
        DefaultMutableTreeNode sebihi = new DefaultMutableTreeNode("SEBIHI (Développeur)");
        DefaultMutableTreeNode nouari = new DefaultMutableTreeNode("NOUARI (Développeur)");

        // Ajouter les développeurs à SADDIK
        saddik.add(sebihi);
        saddik.add(nouari);
        
        // Ajouter AMALI et SADDIK à RAMI
        root.add(amali);
        root.add(saddik);

        // Créer l'arbre JTree
        JTree tree = new JTree(root);

        // Ajouter le JTree dans un panneau déroulant (pour scroll)
        JScrollPane scrollPane = new JScrollPane(tree);

        // Ajouter le panneau à la fenêtre
        add(scrollPane);
    }

    public static void main(String[] args) {
        // Créer et afficher la fenêtre
        GestionEmployes frame = new GestionEmployes();
        frame.setVisible(true); 
    }
}
