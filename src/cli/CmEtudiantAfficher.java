/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import metier.Etudiant;
import metier.Parcours;

/**
 *
 * @author freecoin
 */
public class CmEtudiantAfficher extends Commande {

    @Override
    public void executer() {
        Etudiant.afficherTout();
    }

    @Override
    public void setParametres(String[] parametres) {
    }
    
}
