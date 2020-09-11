package com.ds.Day2_11;
/* =================================

author ankitrajprasad created on 11/09/20 
inside the package - com.sunbeam.ds.Day2_11 

=====================================*/


import java.util.Scanner;

public class BS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,22,33,44,55,66,77,88,99};
        System.out.print("Enter Number to find :: ");
        int key = sc.nextInt();
        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("Element is not found.");
        }
        else
            System.out.println("Element is  found :: "+index);

        String[] arr2 = {"A","B","C","D","E","F"};
        System.out.print("Enter String to find :: ");
        String key2 = sc.next();
        int index2 = binarySearch2(arr2,key2);
        if(index2 == -1){
            System.out.println("Element is not found.");
        }
        else
            System.out.println("Element is  found :: "+index2);

    }

    private static int binarySearch2(String[] arr2, String key2) {
        int left = 0 , right = arr2.length -1 , mid;
        while(left <= right) {
            mid = (left + right) / 2;
            int res = key2.compareTo(arr2[mid]);

            if (res == 0)
                return mid;
            if (res < 0)
                right = mid - 1;
            else //key> arr[mid]
                left = mid + 1;
        }

        return -1;

    }

    private static int binarySearch(int[] arr, int key) {
        int left = 0 , right = arr.length -1 , mid;
    while(left <= right) {
        mid = (left + right) / 2;
        if (key == arr[mid])
            return mid;
        if (key < arr[mid])
            right = mid - 1;
        else //key> arr[mid]
            left = mid + 1;
    }
        return -1;
    }
}
