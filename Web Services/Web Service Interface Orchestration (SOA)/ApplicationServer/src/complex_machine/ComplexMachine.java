/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex_machine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manasvi
 */
public class ComplexMachine {
    
    
    public static void complex(int arr[]){
        
        int counter = 0;
        
        List<Integer> lst = new ArrayList<>();
        
        for(int i=0;i<arr.length;i+=2){
            //i=0,4,8..
            if(counter==0){
                lst.add((int)multiply(arr[i],arr[i+1]));            
                counter++;
            }
            //i=2,6..
            else{
                lst.add((int)substract(arr[i],arr[i+1]));
                counter--;
            }
                       
        }
        
        System.out.println(mergeSort(lst));
        
        
        
    
        
    }
    
    
    
    
    
    public static void main(String args[]){
    
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        complex(arr);
    }

    private static java.util.List<java.lang.Integer> mergeSort(java.util.List<java.lang.Integer> arg0) {
        sortingmachine.SortWorkService service = new sortingmachine.SortWorkService();
        sortingmachine.SortInterface port = service.getSortWorkPort();
        return port.mergeSort(arg0);
    }

    private static double multiply(double arg0, double arg1) {
        calculatorApp.CalculatorWorkService service = new calculatorApp.CalculatorWorkService();
        calculatorApp.Calculator port = service.getCalculatorWorkPort();
        return port.multiply(arg0, arg1);
    }

    private static double substract(double arg0, double arg1) {
        calculatorApp.CalculatorWorkService service = new calculatorApp.CalculatorWorkService();
        calculatorApp.Calculator port = service.getCalculatorWorkPort();
        return port.substract(arg0, arg1);
    }

  

    
}
