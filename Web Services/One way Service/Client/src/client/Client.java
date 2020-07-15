/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Manasvi
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Client.setName("Sanket");
        System.out.println(Client.message());
    }

    private static void setName(java.lang.String arg0) {
        weboperations_service.WebOperationsService service = new weboperations_service.WebOperationsService();
        weboperations_service.WebOperations port = service.getWebOperationsPort();
        port.setName(arg0);
    }

    private static String message() {
        weboperations_service.WebOperationsService service = new weboperations_service.WebOperationsService();
        weboperations_service.WebOperations port = service.getWebOperationsPort();
        return port.message();
    }
    
}
