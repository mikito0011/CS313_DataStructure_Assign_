/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4mita1;

/**
 *
 * @author mikito
 */
public class A4mita1 {

    /**
     * @param args the command line arguments
     */
    static class MergeSort{
    public  void mergeSort(int []array, int l_bound, int u_bound){
        if(l_bound>=u_bound) return ;
        int mid =(u_bound+l_bound)/2;
        mergeSort(array, l_bound, mid);
        mergeSort(array, mid+1,u_bound);
        merge(array,l_bound, mid, u_bound);
    }
     void merge(int arr[], int l, int m, int r) 
    { 
        int l_size = m - l + 1; //The size of left array
        int r_size = r - m; //The size of right array
  
        int l_arr[] = new int [l_size]; 
        int r_arr[] = new int [r_size]; 
  
        for (int i=0; i<l_size; ++i) 
            l_arr[i] = arr[l + i]; 
        for (int j=0; j<r_size; ++j) 
            r_arr[j] = arr[m + 1+ j]; 
  
        int i = 0, j = 0,k = l;;  
        
        while (i < l_size && j < r_size) 
        { 
            if (l_arr[i] <= r_arr[j]) 
            { 
                arr[k] = l_arr[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = r_arr[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < l_size) // Copy remaining elements of left array
        { 
            arr[k] = l_arr[i]; 
            i++; 
            k++; 
        } 
  
        while (j < r_size) // Copy remaining elements of right array
        { 
            arr[k] = r_arr[j]; 
            j++; 
            k++; 
        } 
    }    }
     public static void printArray(int a[]){
         int size = a.length;
         for(int i=0; i<size; i++){
             System.out.print(a[i]+", ");
         }
         System.out.println();
     }
    public static void main(String[] args) {
        int arr[] = {2,1,3,7,6,5,9,4,8};
        System.out.print("Original Array:"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.mergeSort(arr, 0, arr.length-1); 
  
        System.out.print("\nSorted array: "); 
        printArray(arr); 
    }
    
}
