/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

/**
 *
 * @author freecoin
 */
public class ParseurCommande {
    public Commande parser(String strCommande){
        String[] tbCmd = strCommande.trim().split(" ");
        String premierMot = tbCmd[0].toUpperCase();
        Commande commande;
        switch(premierMot) {
            case "EXIT" : 
               commande = new CmQuitter();
               break;
            case "HELP" :
               commande = new CmAide();
               break;
            default : 
               commande = new CmInconnue();
        }
        commande.setParametres(tbCmd);
        return commande;
    }
}
