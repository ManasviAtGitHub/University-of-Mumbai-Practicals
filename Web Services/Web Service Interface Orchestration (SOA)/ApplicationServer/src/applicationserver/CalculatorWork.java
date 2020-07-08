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
@WebService(endpointInterface="applicationserver.Calculator")
public class CalculatorWork implements Calculator {

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double substract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        return a/b;
    }

    @Override
    public double modulus(double a, double b) {
        return a%b;
    }
    
    
}
