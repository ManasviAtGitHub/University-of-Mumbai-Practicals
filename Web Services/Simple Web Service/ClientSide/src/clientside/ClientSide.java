/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientside;

/**
 *
 * @author Manasvi
 */
public class ClientSide {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
   
        System.out.println(ClientSide.name("Sanket"));
        

    }

    private static String name(java.lang.String arg0) {
        serverside.ServerSideService service = new serverside.ServerSideService();
        serverside.ServerSide port = service.getServerSidePort();
        return port.name(arg0);
    }



    
}
