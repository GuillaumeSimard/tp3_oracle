/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import entity.Utilisateur;


/**
 *
 * @author Guillaume
 */
public class Utilisateur_dao {
    
    public Utilisateur getUtilConnexion(String nom, String motDePasse){
        
        Session sessionUtil = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        Utilisateur unUtilisateur = new Utilisateur();
        
        try{
            sessionUtil.beginTransaction();
             Criteria criteria= sessionUtil.createCriteria(Utilisateur.class)
             .add(Restrictions.lt("nom",nom))
             .add(Restrictions.lt("motdepasse", motDePasse));
             
             unUtilisateur = (Utilisateur)criteria.uniqueResult();
             sessionUtil.getTransaction().commit();
             
             
             if(!unUtilisateur.getNom().equals(nom) && unUtilisateur.getMotdepasse().equals(motDePasse)){
                 unUtilisateur = null;
             }
                
        }catch(Exception ex){
            ex.printStackTrace();
            sessionUtil.getTransaction().rollback();
        }
        
        return unUtilisateur;
    }
    
}
