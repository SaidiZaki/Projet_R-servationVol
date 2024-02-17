/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import javax.swing.JTextField;

/**
 *
 * @author Zaki
 */
public class Passager {
    private String nom;
    private String prenom;
    private int numPassport;
    private String adresse;

    public Passager() {
    }

    public Passager(String nom, String prenom, int numPassport, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numPassport = numPassport;
        this.adresse = adresse;
    }

    public Passager(String nom, String prenom, JTextField txtAdresse, int numPassport) {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumPassport() {
        return numPassport;
    }

    public void setNumPassport(int numPassport) {
        this.numPassport = numPassport;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Passager{" + "nom=" + nom + ", prenom=" + prenom + ", numPassport=" + numPassport + ", adresse=" + adresse + '}';
    }
    
    
     
}
