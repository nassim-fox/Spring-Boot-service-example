
package etudiantserv;

import javax.xml.ws.Endpoint;
import service.EtudiantService;

/**
 *
 * @author Nassim Bouhadouf <Nassim.Bouhadouf at https://github.com/nassim-fox/>
 */
public class EtudiantServ {

    public static void main(String[] args) {

        String url = "http://localhost:8586/" ; 
        
        Endpoint e =  Endpoint.publish(url,new EtudiantService()) ; 
    }
    
}
