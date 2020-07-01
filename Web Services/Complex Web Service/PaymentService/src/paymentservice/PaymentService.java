/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Manasvi
 */
@WebService
public class PaymentService {

    /**
     * @param args the command line arguments
     */
    @WebMethod
    public String paymentMode(String mode){
        
        return "Payment type : "+mode;
    
    }
    
    @WebMethod
    public boolean status(int i){
        if (i==1)
            return true;
        else
            return false;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Endpoint.publish("http://localhost:9002/PaymentService", new PaymentService());
        System.out.println("Payment Service Running ..... ");
    
    }
    
}
