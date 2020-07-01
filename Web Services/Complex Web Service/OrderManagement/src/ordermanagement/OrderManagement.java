/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagement;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import paymentservice.PaymentService;

/**
 *
 * @author Manasvi
 */
@WebService
public class OrderManagement {

    /**
     * @param args the command line arguments
     */
    
    
    
    @WebMethod
    public ArrayList orderProduct(String mode, int status, String name, String product, Double price){
    
        ArrayList list = new ArrayList();
        
        list.add(paymentMode(mode));
        
        if(status(status)){
            ArrayList l = (ArrayList) printBill(name, product, price);
                
            list.add(l.get(0));
            list.add(l.get(1));
            list.add(l.get(2));
            list.add(l.get(3));
            list.add("Transaction Successful");
            
            
            
        }else{
            list.add("Transaction UnSuccessful");
        }
        
        
        
        return list;
        
    }
    
    
    
    public static void order(String mode, int status, String name, String product, Double price){
    
            String s = paymentMode(mode);
            System.out.println(s);
            boolean b = status(status);
            
            if(b){
                
                ArrayList list = (ArrayList) printBill(name, product, price);
                
                System.out.println(list.get(0));
                System.out.println(list.get(1));
                System.out.println(list.get(2));
                System.out.println(list.get(3));
                
                System.out.println("Transaction Successful");
            }else{
                System.out.println("Transaction Unsuccessful");
            }
        
        
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here


//        order("Debit",1,"Rohan","Shoes",5000.0);
        Endpoint.publish("http://localhost:9003/Order", new OrderManagement());
        System.out.println("OrderManagement Service Running ..... ");
        
    }



    private static String paymentMode(java.lang.String arg0) {
        paymentservice.PaymentServiceService service = new paymentservice.PaymentServiceService();
        paymentservice.PaymentService port = service.getPaymentServicePort();
        return port.paymentMode(arg0);
    }

    private static boolean status(int arg0) {
        paymentservice.PaymentServiceService service = new paymentservice.PaymentServiceService();
        paymentservice.PaymentService port = service.getPaymentServicePort();
        return port.status(arg0);
    }

    private static java.util.List<java.lang.Object> printBill(java.lang.String arg0, java.lang.String arg1, java.lang.Double arg2) {
        billing.BillingService service = new billing.BillingService();
        billing.Billing port = service.getBillingPort();
        return port.printBill(arg0, arg1, arg2);
    }
    
}
