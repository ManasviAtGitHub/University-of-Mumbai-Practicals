/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;


import java.time.LocalDate;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Manasvi
 */
@WebService
public class Billing {

    /**
     * @param args the command line arguments
     */
    
    @WebMethod
    public ArrayList printBill(String customer, String product, Double price){
        
        ArrayList bill = new ArrayList();
        bill.add("Customer Name : "+customer);
        bill.add("Product Name : "+product);
        bill.add("Price : "+price);
        bill.add("Date : "+LocalDate.now());
        
        return bill;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Billing b = new Billing();
//        ArrayList list = b.printBill("Emilia Clarke", "Socks", 1000.0);
//        
//        
//        for(Object l: list){
//            System.out.println(l);
//        }
        
        Endpoint.publish("http://localhost:9001/Billing", new Billing());
        System.out.println("Billing Service Running ..... ");
    
    }
    
}
