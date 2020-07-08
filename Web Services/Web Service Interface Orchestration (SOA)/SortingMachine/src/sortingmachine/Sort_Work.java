/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingmachine;

import javax.jws.WebService;

/**
 *
 * @author Manasvi
 */
@WebService(endpointInterface = "sortingmachine.Sort_Interface")
public class Sort_Work implements Sort_Interface {

    public int global[];
    
    
    @Override
    public int[] mergeSort(int[] arr) {
        
        global = arr;     
        mergeSort(global,global.length);     
        return global;
        
    }
    //divide part
    private static void mergeSort(int [] a, int n){
    
        if (n<2){
            return;
        }
        int mid = n/2;
        int [] l = new int[mid];
        int [] r = new int[n-mid];
        
        for(int i = 0; i < mid; i++){
            l[i] = a[i];
        }
        
        for(int i = mid; i < n; i++){
            r[i-mid] = a[i];
        }
        mergeSort(l,mid);
        mergeSort(r,n-mid);
        merge(a,l,r,mid,n-mid);
        
    }
    //merge part
    private static void merge(int []a, int []l, int []r, int left, int right){
        int i=0, j=0, k=0;
        while(i<left && j<right){
            if(l[i] <= r[j] ){
                a[k++]=l[i++];
            }else{
                a[k++]=r[j++];
            }
        }
        
        while(i<left){
            a[k++] = l[i++];
        }
        while(j<right){
            a[k++] = r[j++];
        }
    
    }
    
    
}
