package entity;
// Generated 2015-04-23 10:49:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name="UTILISATEUR"
    ,schema="C##GUILLAUME"
)
public class Utilisateur  implements java.io.Serializable {


     private BigDecimal idutilisateur;
     private String nom;
     private String motdepasse;
     private char status;

    public Utilisateur() {
    }

    public Utilisateur(BigDecimal idutilisateur, String nom, String motdepasse, char status) {
       this.idutilisateur = idutilisateur;
       this.nom = nom;
       this.motdepasse = motdepasse;
       this.status = status;
    }
   
     @Id 

    
    @Column(name="IDUTILISATEUR", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdutilisateur() {
        return this.idutilisateur;
    }
    
    public void setIdutilisateur(BigDecimal idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    
    @Column(name="NOM", nullable=false, length=50)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="MOTDEPASSE", nullable=false, length=50)
    public String getMotdepasse() {
        return this.motdepasse;
    }
    
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    
    @Column(name="STATUS", nullable=false, length=1)
    public char getStatus() {
        return this.status;
    }
    
    public void setStatus(char status) {
        this.status = status;
    }




}


