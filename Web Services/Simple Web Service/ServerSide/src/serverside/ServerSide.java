/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverside;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Manasvi
 */
@WebService
public class ServerSide {

    /**
     * @param args the command line arguments
     */
    
    @WebMethod
    public String name(String str){        
        return "Hello "+str+" from Web Service";
    }
    

    
    
    
    
    public static void main(String[] args) {
        
        ServerSide s = new ServerSide();
        
//        System.out.println(s.name("Shravan"));
        // TODO code application logic here
        Endpoint.publish("http://localhost:9000/hello", new ServerSide());
        System.out.println("ServerSide Service Running ..... ");
    }
    
}
