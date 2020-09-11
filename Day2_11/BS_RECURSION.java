package com.ds.Day2_11;
/* =================================

author ankitrajprasad created on 11/09/20 
inside the package - com.ds.Day2_11

=====================================*/


import java.util.Scanner;
//O(log n)
public class BS_RECURSION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,22,33,44,55,66,77,88,99};
        System.out.print("Enter Number to find :: ");
        int key = sc.nextInt();
        int left = 0;
        int right = arr.length-1;
        int index = binarySearch(arr, left, right, key);
        if(index == -1){
            System.out.println("Element is not found.");
        }
        else
            System.out.println("Element is  found :: "+index);
    }

    private static int binarySearch(int[] arr, int left, int right, int key) {
        //If invalid partiton, element not found.
        if(right < left)
            return -1;

        int index;
        int mid = (left+right)/2;
        if(key == arr[mid])
            return mid;

        //if key is smaller than middle element, search in left partition
        if( key < arr[mid])
            index = binarySearch(arr, left, mid - 1, key);
        else
            //if key is greater than middle element, search in right partition
            index = binarySearch(arr, mid+1, right, key);
        return index;

    }


}
