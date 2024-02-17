/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Passager;
import modele.Siege;
import modele.Vol;

/**
 *
 * @author Zaki
 */
public class Manipulation {
   // charger les vol d'une fichier externe:
    public static  Object[] chargerVols() throws FileNotFoundException {
        File fice = new File("src\\data\\vols.txt");
        FileReader fr = null;
        BufferedReader br = null;
        fr = new FileReader(fice);
        br = new BufferedReader(fr);
        Object[] lines = br.lines().toArray();
        return lines;
    }
    //enregistrer tous les information du passager et du vol:

    public static void enregistrerVols(String s, Passager passager, Vol vol, Siege siege) {
        File fico=  new File(s);
        FileWriter fw= null;
        BufferedWriter bw= null;
        
        try {
            fw= new FileWriter(fico);
            bw = new BufferedWriter(fw);
            String ligne= passager.getPrenom()+" "+passager.getNom()+" "+passager.getNumPassport()+"\n "
                    +vol.getNumVol()+" "+vol.getAeroportD()+" "+vol.getAeroportA()+" "+vol.getDateD()+" "+vol.getDateA()+" "+vol.getHeureD()+" "+vol.getHeureA()+"\n"
                    +siege.getNumSiege()+" "+siege.getPrix();
        } catch (IOException ex) {
            Logger.getLogger(Manipulation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
