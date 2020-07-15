/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_service_1;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Manasvi
 */
@WebService
public class HelloWebService {
    @WebMethod
    public String name(String str){        
        return "Hello "+str+" from Web Service";
    }
    
    
    public static void main(String[] args) {
        

        Endpoint.publish("http://localhost:9011/hello", new HelloWebService ());
        System.out.println("ServerSide Service Running ..... ");
    }
    
    
}
