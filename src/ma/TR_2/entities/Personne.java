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


public class Personne {
    protected int id;
    protected String nom;
    protected double salaire;

    public Personne(int id, String nom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.salaire = salaire;
    }

    // Getters et setters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public double getSalaire() { return salaire; }
}





