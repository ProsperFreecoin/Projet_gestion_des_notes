/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author freecoin
 */
public class Parcours {
    private String libelle;
    private List<Etudiant> etudiants = new ArrayList<>();
    private List<Etablissement> etablissements= new ArrayList<>();
    private List<UniteEnseignement> uniteEnseignements = new ArrayList<>();
    
    public Parcours(){
    }

    public String getLibelle() {
        return libelle;
    }
    
    public Parcours(String libelle){
        this.libelle= libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
//getter et setter de l'association entre Parcours et Etudiant
    public List<Etudiant> getEtudiants() {
        return etudiants;
    }
    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
    
// getter et setter de l'association entre Parcours et Etablissement
    public List<Etablissement> getEtablissements() {
        return etablissements;
    }

    public void setEtablissements(List<Etablissement> etablissements) {
        this.etablissements = etablissements;
    }

 //getter et setter de l'association entre Parcours et UniteEnseignement
    public List<UniteEnseignement> getUniteEnseignements() {
        return uniteEnseignements;
    }
    public void setUniteEnseignements(List<UniteEnseignement> uniteEnseignements) {
        this.uniteEnseignements = uniteEnseignements;
    }
}
