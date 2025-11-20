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
public class Etablissement {
    private String code;
    private String libelle;
    private List<Parcours> parcourss = new ArrayList<>();
    
    public Etablissement(){
    }
    public Etablissement(String code, String libelle){
        this.code=code;
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
    
    //getter et setter de l'association entre Parcours et Etablissement
    public List<Parcours> getParcourss(){
        return this.parcourss;
    }
    public void setParcours(List<Parcours> parcourss){
        this.parcourss= parcourss;
    }
}
