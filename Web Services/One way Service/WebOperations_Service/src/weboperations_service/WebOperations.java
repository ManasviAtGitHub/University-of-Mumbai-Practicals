/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weboperations_service;

import java.util.Date;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Manasvi
 */
@WebService
public class WebOperations {

    /**
     * @param args the command line arguments
     */
    String name;
    @WebMethod
    @Oneway
    public void setName(String n){
        this.name=n;
    }
    @WebMethod
    public String message(){
        return "Hello "+name+" today is "+new Date().toString();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Endpoint.publish("http://localhost:1201/ws", new WebOperations());
        System.out.println("WebOperations Service Published ...");
    }
    
}
