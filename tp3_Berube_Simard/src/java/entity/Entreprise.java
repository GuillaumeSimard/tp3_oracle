package entity;
// Generated 2015-04-23 11:47:06 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entreprise generated by hbm2java
 */
@Entity
@Table(name="ENTREPRISE"
    ,schema="C##GUILLAUME"
)
public class Entreprise  implements java.io.Serializable {


     private BigDecimal identreprise;
     private String nom;
     private String adresse;
     private String codepostal;
     private String localite;
     private Set<Stage> stages = new HashSet<Stage>(0);

    public Entreprise() {
    }

	
    public Entreprise(BigDecimal identreprise, String nom, String adresse, String codepostal, String localite) {
        this.identreprise = identreprise;
        this.nom = nom;
        this.adresse = adresse;
        this.codepostal = codepostal;
        this.localite = localite;
    }
    public Entreprise(BigDecimal identreprise, String nom, String adresse, String codepostal, String localite, Set<Stage> stages) {
       this.identreprise = identreprise;
       this.nom = nom;
       this.adresse = adresse;
       this.codepostal = codepostal;
       this.localite = localite;
       this.stages = stages;
    }
   
     @Id 

    
    @Column(name="IDENTREPRISE", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdentreprise() {
        return this.identreprise;
    }
    
    public void setIdentreprise(BigDecimal identreprise) {
        this.identreprise = identreprise;
    }

    
    @Column(name="NOM", nullable=false, length=20)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="ADRESSE", nullable=false, length=30)
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    
    @Column(name="CODEPOSTAL", nullable=false, length=6)
    public String getCodepostal() {
        return this.codepostal;
    }
    
    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    
    @Column(name="LOCALITE", nullable=false, length=20)
    public String getLocalite() {
        return this.localite;
    }
    
    public void setLocalite(String localite) {
        this.localite = localite;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="entreprise")
    public Set<Stage> getStages() {
        return this.stages;
    }
    
    public void setStages(Set<Stage> stages) {
        this.stages = stages;
    }




}


