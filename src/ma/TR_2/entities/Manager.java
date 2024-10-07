/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.TR_2.entities;

/**
 *
 * @author user
 */


import java.util.ArrayList;
import java.util.List;

public class Manager extends Personne {
    private List<Personne> subordonnees;

    public Manager(int id, String nom, double salaire) {
        super(id, nom, salaire);
        this.subordonnees = new ArrayList<>();
    }

    public void addSubordonne(Personne p) {
        subordonnees.add(p);
    }

    public List<Personne> getSubordonnees() {
        return subordonnees;
    }
}
