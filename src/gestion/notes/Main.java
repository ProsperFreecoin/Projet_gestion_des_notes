/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.notes;

import cli.Commande;
import cli.ParseurCommande;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import metier.Etablissement;
import metier.Etudiant;
import metier.InscriptionUE;
import metier.Parcours;
import metier.UniteEnseignement;

/**
 *
 * @author freecoin
 */
public class Main {
    private static Scanner clavier = new Scanner(System.in);
    private static ParseurCommande parseur = new ParseurCommande();
    public static void main(String[] args) {
        System.out.println("Bonjour!!!");
        while(true){
            String strCmde = clavier.nextLine();
            Commande commande = parseur.parser(strCmde);
            commande.executer();
        }
    }
    
    
    private static void test(){
         Parcours parcourGL= new Parcours("LPro GL");
        Parcours parcourSRI= new Parcours("LPro SRI");
        Etablissement etablissementEPL = new Etablissement("EPL", "Ecole "
                + "Polytechnique de Lome");
        Etablissement etablissementFDS = new Etablissement("FDS", "Faculte Des "
                + "Sciences");
        
        //Ajout des parcours et etablissements definis à la liste des parcours
       /* List<Parcours> prcs = new ArrayList();
        prcs.add(parcourSRI);
        prcs.add(parcourSRI);*/
       
        //Ajout des etablissements dans les Parcours ainsi que l'ajout des differents parcours
        etablissementEPL.getParcourss().add(parcourGL);
        etablissementEPL.getParcourss().add(parcourSRI);
        
        etablissementFDS.getParcourss().add(parcourGL);
        
        //Creation d'etudiant 
        Etudiant nvEtudiant1 = new Etudiant("N'GUIMBE", "Prosper", 
                LocalDate.now(), 1234);
        Etudiant nvEtudiant2 = new Etudiant("KOMI", "Free",LocalDate.now(),3456);
        
        //Creation des Unités d'enseignement
        UniteEnseignement poo= new UniteEnseignement("INF 1326", "POO");
        UniteEnseignement uml= new UniteEnseignement("INF 1436", "UML");
        
        //Ajoutt des Inscriptions pour les UEs
        poo.getInscriptionUE().add(new InscriptionUE(nvEtudiant1, poo));
        poo.getInscriptionUE().add(new InscriptionUE(nvEtudiant2, poo));
        
        //Ajout des Etudiant pour les inscriptions dans les UEs
        nvEtudiant1.getInscriptionUE().add(new InscriptionUE(nvEtudiant1, poo));
        nvEtudiant2.getInscriptionUE().add(new InscriptionUE(nvEtudiant2, poo));
    }
}
