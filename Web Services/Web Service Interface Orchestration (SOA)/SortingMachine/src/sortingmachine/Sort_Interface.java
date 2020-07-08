/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingmachine;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Manasvi
 */

@WebService
public interface Sort_Interface {
    @WebMethod
    public int[] mergeSort(int arr[]);
}
