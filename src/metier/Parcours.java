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
    private static List<Parcours> liste = new ArrayList<>();
    private static int sequence = 1;
    private int id;
    private String libelle;
    private List<Etudiant> etudiants = new ArrayList<>();
    private List<Etablissement> etablissements= new ArrayList<>();
    private List<UniteEnseignement> uniteEnseignements = new ArrayList<>();
    
    public Parcours(){
        liste.add(this);
    }
    public Parcours(int id , String libelle){
        this();
        this.id = id;
        this.libelle = libelle;
    }
    public Parcours(String libelle){
        this(sequence,libelle);
        sequence =sequence + 1; 
    }
    
    //Methode de classe pour afficher
    public static String getHeader(){  
        return "N° \t Identifiant \t Libelle";
    }
    //Methode de classe pour afficher tous les parcours
    public static void afficherTout(){
        int i = 1;
        System.out.println(getHeader());
        for(Parcours p: liste){
            System.out.println(i + "\t " + p);
            i++;
        }
    }
    public void afficher(){
        System.out.println(this);
    }
    public void afficherEtudiants(){
        int i = 1;
        System.out.println(Etudiant.getHeader());
        for(Etudiant etudiant : this.etudiants){
            System.out.println(i + "\t " + etudiant);
            i++;
        }
            
    }
    public void inscrireEtudiant(Etudiant etudiant){
        etudiant.setParcours(this);
        this.etudiants.add(etudiant);
    }
    
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public static List<Parcours> getListe(){
        return liste;
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
    
    
    @Override
    public String toString() {
        return this.id + "\t" + this.libelle ;
                }
}
