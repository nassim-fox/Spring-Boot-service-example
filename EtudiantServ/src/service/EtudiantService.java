

package service;

import javax.jws.WebService;
import entity.Etudiant ; 
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Nassim Bouhadouf
 * 
 */

@WebService(serviceName="EtudiantService")
public class EtudiantService {

    private static ArrayList <Etudiant> etudiant_list = new ArrayList<>() ; 
    
    static
    {
        etudiant_list.add(new Etudiant(1,"mehdi","djezzar","mehdi@gmail.com",(float)12.25)) ;
        etudiant_list.add(new Etudiant(2,"nassim","elk","nassimelk@gmail.com",(float)13.25))  ; 
        etudiant_list.add(new Etudiant(8,"ilyes","amara","ilyes@gmail.com",(float)11.25))  ; 
        etudiant_list.add(new Etudiant(9,"kerdjou","toufik","toufik@gmail.com",(float)11.65))  ; 
        etudiant_list.add(new Etudiant(5,"nesro","ghalmi","nesro@gmail.com",(float)11.85))  ; 
        
    }   
    
    @WebMethod(operationName="get_etudiant")
    public Etudiant getEtudiant(@WebParam(name="id")int id)
    {
        for(Etudiant e : etudiant_list)
        {
            if(e.getId()==id)
                return e ; 
        }
        
        return null ;
    }
    
    @WebMethod(operationName="get_etudiant_list_by_note")
    public ArrayList<Etudiant> getEtudiantListByNote(@WebParam(name="note") float note)
    {
        ArrayList<Etudiant> r = new ArrayList<>() ; 
        
        for(Etudiant e : etudiant_list)
        {
            if(e.getMoyenne()>note)
            {
                r.add(e) ; 
            }
        }
        
        return r ; 
    }
    
}
