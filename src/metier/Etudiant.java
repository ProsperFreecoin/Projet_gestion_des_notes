/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static metier.Parcours.getHeader;

/**
 *
 * @author freecoin
 */
public class Etudiant {
    private static List<Etudiant> liste = new ArrayList();
    private static int sequence = 1;
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private int numeroCarte;
    private Parcours parcours;
    private List<InscriptionUE> inscriptionUE = new ArrayList<>();
    private Ordinateur ordinateur;
    
    public Etudiant(){
       //Ajout des etudiants entrés dans la liste des etudiants
       liste.add(this);
    }
    
    public Etudiant(String nom, String prenom, LocalDate dateNaissance ,int 
            numeroCarte){
        this();
        this.nom= nom;
        this.prenom= prenom;
        this.dateNaissance= dateNaissance;
        this.numeroCarte= numeroCarte;
    }
    public Etudiant(int id, int numeroCarte){
        this();
        this.id = id;
        this.numeroCarte = numeroCarte;
    }
    public Etudiant(int numeroCarte, String nom, String prenom, LocalDate dateNaissance){
        this(sequence, numeroCarte);
        sequence = sequence +1;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }
    public static String getHeaders(){  
        return "N° \t Identifiant \t Numero de carte";
    }
    public static String getHeader(){  
        return "N° \t Carte \t Nom \t Prénom \t Date de naissance";
    }
    public static void afficherTout(){
        int i = 1;
        System.out.println(getHeader());
        for(Etudiant e: liste){
            System.out.println(i + "\t " + e);
            i++;
        }
    }
    public void afficher(){
        System.out.println(this);
    }
    
    public float getMoyenne(){
        int sommeCredits = 0;
        float moyenneAlgebrique = 0;
        for(InscriptionUE iUE : this.inscriptionUE){ 
            sommeCredits +=iUE.getuE().getNbreCredits(); 
            moyenneAlgebrique +=iUE.getMoyenne();
        }
        return moyenneAlgebrique/sommeCredits;
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

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.numeroCarte + "\t" 
                + this.nom + "\t" 
                + this.prenom + "\t" 
                + this.dateNaissance;
    }
   
}
