/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.TR_2.services;

/**
 *
 * @author user
 */

import ma.TR_2.entities.Developpeur;
import ma.TR_2.dao.IDao;
import java.util.ArrayList;
import java.util.List;

public class DeveloppeurService implements IDao<Developpeur> {
 private List<Developpeur> developpeurs = new ArrayList<>();

    @Override
    public boolean create(Developpeur d) {
        return developpeurs.add(d); // Ajout du développeur à la liste
    }

    @Override
    public boolean update(Developpeur d) {
        Developpeur existingDeveloppeur = findById(d.getId());
        if (existingDeveloppeur != null) {
            int index = developpeurs.indexOf(existingDeveloppeur);
            developpeurs.set(index, d); // Mise à jour du développeur
            return true;
        }
        return false; // Si le développeur n'existe pas
    }

    @Override
    public boolean delete(Developpeur d) {
        return developpeurs.remove(d); // Suppression du développeur de la liste
    }

    @Override
    public Developpeur findById(int id) {
        // Recherche du développeur par identifiant
        return developpeurs.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Developpeur> findAll() {
        return developpeurs; // Retourne tous les développeurs
    }
}
