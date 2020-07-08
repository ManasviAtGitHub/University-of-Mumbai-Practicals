/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationserver;

import javax.xml.ws.Endpoint;

/**
 *
 * @author User
 */
public class HostCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Endpoint.publish("http://localhost:9005/calculate",new CalculatorWork());
        System.out.println("Calculator Service Running ..... ");
    }
}
