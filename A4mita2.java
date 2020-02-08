/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4mita2;

/**
 *
 * @author mikito
 */
public class A4mita2 {

    /**
     * @param args the command line arguments
     */
    static class MaxheapPriorityQueue{
        private int[] heap;
        private int size;
        public MaxheapPriorityQueue(int a[]){
            heap = a;
            size = a.length;
            buildHeap(heap, size);
        }
        static void heapify(int arr[], int n, int i) 
    {   int largest = i; //set largest root
        int l = 2 * i + 1; // left subtree from the root
        int r = 2 * i + 2; // right right  from the root
  
        if (l < n && arr[l] > arr[largest]) //compare the largest with left subtree
            largest = l; 
  
     
        if (r < n && arr[r] > arr[largest]) //compare the largest with right subtree
            largest = r; 
  
        if (largest != i) { 
            //swap the value if the largest is not root
            int temp = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = temp; 
            heapify(arr, n, largest); 
        } 
    }
        static void buildHeap(int arr[], int size) //Construct the heap from the last inner node.
    { 
        int start = (size / 2) - 1; // the last inner node 
        for (int i = start; i >= 0; i--) { 
            heapify(arr, size, i); 
        } 
    } 
                }
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+","); 
        System.out.println(); 
    } 
    
    public static void main(String[] args) {
        int arr[] = {5,8,3,2,4,9,3,10}; 
        int n = arr.length; 
        System.out.print("Original array: ");
        printArray(arr);
        MaxheapPriorityQueue ob = new MaxheapPriorityQueue(arr); 
        
  
        System.out.print("Max haep : "); 
        printArray(arr); 
    }
    
}

