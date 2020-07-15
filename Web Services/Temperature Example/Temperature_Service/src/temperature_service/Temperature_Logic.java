/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature_service;

import javax.jws.WebService;

/**
 *
 * @author Manasvi
 */
@WebService(endpointInterface ="temperature_service.Temperature_Interface")
public class Temperature_Logic implements Temperature_Interface {

    @Override
    public double farenheit_to_celsius(double f) {
        return ((f-32) * 0.5556);
    }

    @Override
    public double celsius_to_farenheit(double c) {
        return ((c*1.8)+32);
    }
    
}
