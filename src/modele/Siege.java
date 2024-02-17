/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Zaki
 */
public class Siege {
    private int numSiege;
    private double prix;
    private boolean etat;

    public Siege() {
    }

    public Siege(int numSiege, double prix, boolean etat) {
        this.numSiege = numSiege;
        this.prix = prix;
        this.etat = etat;
    }

    public Siege(String numSiege, double prix) {
    }

    public int getNumSiege() {
        return numSiege;
    }

    public void setNumSiege(int numSiege) {
        this.numSiege = numSiege;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Siege{" + "numSiege=" + numSiege + ", prix=" + prix + ", etat=" + etat + '}';
    }
    

    
    
}
