/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleurs;

import entity.Utilisateur;
import model.*;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Guillaume
 */
@ManagedBean
@SessionScoped
public class UtilisateurBean implements Serializable{

    //attribut du contrôleur
    private String nom;
    private String motDePasse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    Utilisateur utilisateurConnecte;
 
    /**
     * constructeur par défault.
     */
    public UtilisateurBean(){
        
    }
    /**
     * constructeur paramètré du Bean de l'utilisateur.
     * @param nom
     * @param motDePasse 
     */
    public UtilisateurBean(String nom, String motDePasse){
        this.nom = nom;
        this.motDePasse = motDePasse;
    }
    
    /**
     * Méthode nous permettant de vérifer si l'utilisateur peu-être
     * sconnecter 
     * @return 
     */
    public String verifierConnexion(){
        
        Utilisateur_dao TentativeConnexion = new Utilisateur_dao();
        utilisateurConnecte = TentativeConnexion.getUtilConnexion(nom, motDePasse);
        
        if(utilisateurConnecte != null){
            return "index";
        }
        else{
            return "erreurConnexion";
        }
    }
    
    /**
     * Méthode permettant de se déconnecter 
     * @return 
     */
    public String Deconnection()
    {
            nom = null;
            motDePasse  = null;
            utilisateurConnecte = null;
            return "";
    }
    
    
}
