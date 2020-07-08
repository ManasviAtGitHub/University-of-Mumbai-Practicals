/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingmachine;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Manasvi
 */
public class SortingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endpoint.publish("http://localhost:10001/sort",new Sort_Work());
        System.out.println("Sorting Service Running ..... ");
    }
    
}
