
package etudiantservclient;

import service.EtudiantService;
import service.EtudiantService_Service;

/**
 *
 * @author Nassim Bouhadouf <Nassim.Bouhadouf at https://github.com/nassim-fox/>
 */
public class EtudiantServClient {

    
    public static void main(String[] args) {
        
        EtudiantService stub = new EtudiantService_Service().getEtudiantServicePort() ; 
        System.out.println(" etudiant id : 5 is "+stub.getEtudiant(5).getNom()) ;
        
    }
    
}
