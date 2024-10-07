/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.TR_2.test;

/**
 *
 * @author user
 */

import ma.TR_2.entities.Developpeur;
import ma.TR_2.entities.Manager;
import ma.TR_2.entities.Personne;
import ma.TR_2.services.DeveloppeurService;
import ma.TR_2.services.ManagerService;

public class Entreprise {
    public static void main(String[] args) {
        DeveloppeurService devService = new DeveloppeurService();
        ManagerService manService = new ManagerService();

        // Créer deux développeurs
        Developpeur dev1 = new Developpeur(1, "Alice", 3000);
        Developpeur dev2 = new Developpeur(2, "Bob", 3500);
        devService.create(dev1);
        devService.create(dev2);

        // Créer un manager qui gère les deux développeurs
        Manager man1 = new Manager(3, "Eve", 5000);
        man1.addSubordonne(dev1);
        man1.addSubordonne(dev2);
        manService.create(man1);

        // Créer un 3ème développeur
        Developpeur dev3 = new Developpeur(4, "Charlie", 4000);
        devService.create(dev3);

        // Créer un directeur général qui gère le manager et le 3ème employé
        Manager directeur = new Manager(5, "Victor", 7000);
        directeur.addSubordonne(man1);
        directeur.addSubordonne(dev3);
        manService.create(directeur);

        // Afficher les noms et salaires des employésD
        System.out.println("Hiérarchie des employés : ");
        afficherHierarchie(directeur, 0);
    }

    public static void afficherHierarchie(Manager manager, int niveau) {
    // Génération manuelle de l'indentation
    StringBuilder indent = new StringBuilder();
    for (int i = 0; i < niveau; i++) {
        indent.append("    "); // Ajoute 4 espaces pour chaque niveau
    }

    System.out.println(indent + "Manager : " + manager.getNom() + ", Salaire : " + manager.getSalaire());

    // Parcours des subordonnés
    for (Personne p : manager.getSubordonnees()) {
        if (p instanceof Manager) {
            afficherHierarchie((Manager) p, niveau + 1); // Appel récursif pour les managers
        } else {
            System.out.println(indent + "    Développeur : " + p.getNom() + ", Salaire : " + p.getSalaire());
        }
    }
}

}

