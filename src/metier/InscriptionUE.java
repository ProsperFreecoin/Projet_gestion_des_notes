/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

/**
 *
 * @author freecoin
 */
public class InscriptionUE {
    private float moyenne;
    private Etudiant etudiant;
    private UniteEnseignement uE;
    
    public InscriptionUE(){
    }
    public InscriptionUE(Etudiant etudiant, UniteEnseignement uE){
        this.etudiant = etudiant;
        this.uE= uE;
    }
    
    public float getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    //getter et setter de l'association entre Inscription et Etudiant
    public Etudiant getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    //getter et setter de la relation(association) entre InscriptionUE et UniteEnseignement
    public UniteEnseignement getuE() {
        return uE;
    }
    public void setuE(UniteEnseignement uE) {
        this.uE = uE;
    }
}
