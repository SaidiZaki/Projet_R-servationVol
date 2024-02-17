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
public class Vol {
    private int numVol;
    private String aeroportD;
    private String aeroportA;
    private String dateD;
    private String dateA;
    private String heureD;
    private String heureA;
    
    public Vol() {
    }

    public Vol(int numVol, String aeroportD, String aeroportA, String dateD, String dateA, String heureD, String heureA) {
        this.numVol = numVol;
        this.aeroportD = aeroportD;
        this.aeroportA = aeroportA;
        this.dateD = dateD;
        this.dateA = dateA;
        this.heureD = heureD;
        this.heureA = heureA;
    }

    public Vol(String numVol, String aeroportD, String aeroportA, boolean defaultLookAndFeelDecorated, String dateA, String heureD, String heureA) {
    }

    public int getNumVol() {
        return numVol;
    }

    public void setNumVol(int numVol) {
        this.numVol = numVol;
    }

    public String getAeroportD() {
        return aeroportD;
    }

    public void setAeroportD(String aeroportD) {
        this.aeroportD = aeroportD;
    }

    public String getAeroportA() {
        return aeroportA;
    }

    public void setAeroportA(String aeroportA) {
        this.aeroportA = aeroportA;
    }

    public String getDateD() {
        return dateD;
    }

    public void setDateD(String dateD) {
        this.dateD = dateD;
    }

    public String getDateA() {
        return dateA;
    }

    public void setDateA(String dateA) {
        this.dateA = dateA;
    }

    public String getHeureD() {
        return heureD;
    }

    public void setHeureD(String heureD) {
        this.heureD = heureD;
    }

    public String getHeureA() {
        return heureA;
    }

    public void setHeureA(String heureA) {
        this.heureA = heureA;
    }

    @Override
    public String toString() {
        return "Vol{" + "numVol=" + numVol + ", aeroportD=" + aeroportD + ", aeroportA=" + aeroportA + ", dateD=" + dateD + ", dateA=" + dateA + ", heureD=" + heureD + ", heureA=" + heureA + '}';
    }
    
    
    
}
