/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingservice;

import java.util.ArrayList;

/**
 *
 * @author Manasvi
 */
public class ShoppingService {

    /**
     * @param args the command line arguments
     */
    
    
    public void shop(){
    
        ArrayList<ArrayList> customers = new ArrayList();
        
                
        customers.add((ArrayList) orderProduct("Debit",0,"Rohan","Shoes",5000.0));
        customers.add((ArrayList) orderProduct("Credit",1,"Rajesh","T-Shirts",5000.0));
        
        for(ArrayList customer : customers){     
            
            
           
            for(Object details : customer){
                System.out.println(details);
            }
            
            
            System.out.println("-------------------------------------------------------------");
        }
        
    
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ShoppingService s= new ShoppingService();
        s.shop();
        
    }

    private static java.util.List<java.lang.Object> orderProduct(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.Double arg4) {
        ordermanagement.OrderManagementService service = new ordermanagement.OrderManagementService();
        ordermanagement.OrderManagement port = service.getOrderManagementPort();
        return port.orderProduct(arg0, arg1, arg2, arg3, arg4);
    }
    
}
