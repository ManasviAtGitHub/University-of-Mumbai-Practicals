/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature_service;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Manasvi
 */
public class Temperature_Publish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endpoint.publish("http://localhost:1101/temperature_converter", new Temperature_Logic());
        System.out.println("Temperature Service Published ...");
                
    }
    
}
