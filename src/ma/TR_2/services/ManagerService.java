/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.TR_2.services;

import java.util.ArrayList;
import java.util.List;
import ma.TR_2.dao.IDao;
import ma.TR_2.entities.Manager;

/**
 *
 * @author user
 */
public class ManagerService implements IDao<Manager> {
    private List<Manager> managers = new ArrayList<>();

    @Override
    public boolean create(Manager m) {
        return managers.add(m); // Ajout du manager à la liste
    }

    @Override
    public boolean update(Manager m) {
        Manager existingManager = findById(m.getId());
        if (existingManager != null) {
            int index = managers.indexOf(existingManager);
            managers.set(index, m); // Mise à jour du manager
            return true;
        }
        return false; // Si le manager n'existe pas
    }

    @Override
    public boolean delete(Manager m) {
        return managers.remove(m); // Suppression du manager de la liste
    }

    @Override
    public Manager findById(int id) {
        // Recherche du manager par identifiant
        return managers.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Manager> findAll() {
        return managers; // Retourne tous les managers
    }
}
