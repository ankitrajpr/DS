package com.ds.Day2_11;
/* =================================

author ankitrajprasad created on 11/09/20 
inside the package - com.ds.Day2_11 

=====================================*/

//O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,6,3,1};
        selectionSort(arr);
        for (int i =0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    private static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j]) // in increasing order, to decrease , replace "<"
                {
                    int temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
