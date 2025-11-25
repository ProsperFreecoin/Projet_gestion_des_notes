/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.time.LocalDate;
import metier.Etudiant;

/**
 *
 * @author freecoin
 */
public class CmEtudiantCreer extends Commande{
    private int numeroCarte;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    
    @Override
    public void executer() {
        if(this.numeroCarte != 0){
            new Etudiant(this.nom, this.prenom, this.dateNaissance,this.numeroCarte);
        }
    }

    //Parametre à entrer(tout ce que le user doit saisir est mis ici) 
    @Override
    public void setParametres(String[] parametres) {
        /*Conversion de String en int*/
        this.numeroCarte= Integer.parseInt(parametres[0]);
        this.nom= parametres[1];
        this.prenom= parametres[2];
        /*Parametre qui permet de convertir les String en date; c'est à dire 
        que lorsque l'user saisi la date , vu que les paramètres qui sont stockés 
        sont des String,la date sera envoyé ou stockée en String. Maintenant quand
        l'user va afficher cela, cette methode va permettre de la lui afficher
        sous son vrai type(date)*/
        this.dateNaissance= LocalDate.parse(parametres[3]);
        //Parse permet de convertir le string en une donnée que le programme comprend
    }
    
}
