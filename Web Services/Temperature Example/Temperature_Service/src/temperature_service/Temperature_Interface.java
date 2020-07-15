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
@WebService
public interface Temperature_Interface {
    
    double farenheit_to_celsius(double f);
    double celsius_to_farenheit(double c);
    
    
}
