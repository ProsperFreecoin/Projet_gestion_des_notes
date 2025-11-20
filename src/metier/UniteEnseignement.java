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
public class UniteEnseignement {
    private String code;
    private String libelle;
    private int nbreCredits;
    private List<InscriptionUE> inscriptionUE = new ArrayList<>();
    private Parcours parcoursss;

    public UniteEnseignement(){
    }
    public UniteEnseignement(String code, String libelle){
        this.code= code;
        this.libelle=libelle;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbreCredits() {
        return nbreCredits;
    }

    public void setNbreCredits(int nbreCredits) {
        this.nbreCredits = nbreCredits;
    }

    //getter et setter de l'association entre UniteEnseignement et InscriptionUE
    public List<InscriptionUE> getInscriptionUE() {
        return inscriptionUE;
    }

    public void setInscriptionUE(List<InscriptionUE> inscriptionUE) {
        this.inscriptionUE = inscriptionUE;
    }

    //getter et setter de l'association entre UniteEnseignement et Parcours
    public Parcours getParcoursss() {
        return parcoursss;
    }
    public void setParcoursss(Parcours parcoursss) {
        this.parcoursss = parcoursss;
    }
}
