

package entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nassim Bouhadouf
 * 
 */

@XmlRootElement
public class Etudiant {

    private int id ; 
    private String nom ; 
    private String prenom ; 
    private String email ; 
    private float moyenne ; 
    
    public Etudiant()
    {
        
    }

    public Etudiant(int id, String nom, String prenom, String email, float moyenne) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.moyenne = moyenne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }
    
    
}
