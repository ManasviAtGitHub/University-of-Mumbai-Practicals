/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationserver;

import javax.jws.WebService;

/**
 *
 * @author User
 */
@WebService
public interface Calculator {
   double add(double a ,double b);
   double substract(double a ,double b);
   double multiply(double a ,double b);
   double divide(double a ,double b);
   double modulus(double a ,double b);
   
}
