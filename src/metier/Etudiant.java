/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author freecoin
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private int numeroCarte;
    private Parcours parcours;
    private List<InscriptionUE> inscriptionUE = new ArrayList<>();
    private Ordinateur ordinateur;
    
    public Etudiant(){
    }
    
    public Etudiant(String nom, String prenom, LocalDate dateNaissance ,int 
            numeroCarte){
        this.nom= nom;
        this.prenom= prenom;
        this.dateNaissance= dateNaissance;
        this.numeroCarte= numeroCarte;
    }

//    public float getMoyenne(){
//        private float 
//    }
    
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

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(int numeroCarte) {
        this.numeroCarte = numeroCarte;
    }
  //Getters et setters de l'association  entre Etudiant et Parcours
    public Parcours getParcours(){
        return this.parcours;
    }
    public void setParcours(Parcours parcours){
        this.parcours= parcours;
    }

    //getter et setter de l'association entre InscriptionUE et Etudiant
    public List<InscriptionUE> getInscriptionUE() {
        return inscriptionUE;
    }
    public void setInscriptionUE(List<InscriptionUE> inscriptionUE) {
        this.inscriptionUE = inscriptionUE;
    }

    //getter et setter de l'association entre Ordinateur et Etudiant
    public Ordinateur getOrdinateur() {
        return ordinateur;
    }
    public void setOrdinateur(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }
}
