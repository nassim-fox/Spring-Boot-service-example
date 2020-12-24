
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_etudiant_list_by_note complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_etudiant_list_by_note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_etudiant_list_by_note", propOrder = {
    "note"
})
public class GetEtudiantListByNote {

    protected float note;

    /**
     * Obtient la valeur de la propriété note.
     * 
     */
    public float getNote() {
        return note;
    }

    /**
     * Définit la valeur de la propriété note.
     * 
     */
    public void setNote(float value) {
        this.note = value;
    }

}
