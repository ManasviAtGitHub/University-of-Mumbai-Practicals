/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_service_2;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Manasvi
 */
@WebService
public class BillingWebService {
    @WebMethod
    public ArrayList printBill(String customer, String product, Double price){
        
        ArrayList bill = new ArrayList();
        bill.add("Customer Name : "+customer);
        bill.add("Product Name : "+product);
        bill.add("Price : "+price);
        bill.add("Date : "+LocalDate.now());
        
        return bill;
    }
    
    
    
}
