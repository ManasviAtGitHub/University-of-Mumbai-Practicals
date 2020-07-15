/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature_desktop_client;

/**
 *
 * @author Manasvi
 */
public class Temperature_Desktop_Client {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Temperature in farenheit : "+celsiusToFarenheit(37));
        System.out.println("Temperature in celsius : "+farenheitToCelsius(98));
        
    }

    private static double celsiusToFarenheit(double arg0) {
        temperature_service.TemperatureLogicService service = new temperature_service.TemperatureLogicService();
        temperature_service.TemperatureInterface port = service.getTemperatureLogicPort();
        return port.celsiusToFarenheit(arg0);
    }

    private static double farenheitToCelsius(double arg0) {
        temperature_service.TemperatureLogicService service = new temperature_service.TemperatureLogicService();
        temperature_service.TemperatureInterface port = service.getTemperatureLogicPort();
        return port.farenheitToCelsius(arg0);
    }
    
}
