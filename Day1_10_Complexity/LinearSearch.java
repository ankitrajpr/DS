package com.ds.Day1_10_Complexity;
/* =================================

author ankitrajprasad created on 10/09/20 
inside the package - com.sunbeam.ds.Day1_10 

=====================================*/


public class LinearSearch {
    public static void main(String[] args) {
        int[] a= {88,33,66,99,11,77,22,55,11};
        int key = 11;
        System.out.println(key+" is found at index: "+linSearch(a, key));
    }

    private static int linSearch(int[] a, int key) {
        for(int i =0;i<a.length;i++){
            if(a[i] == key){
                return i; //TimeComplexity is O(n) as Worst & AVg Complexity.  Best is O(1)
            }
        }
        return -1;

    }
}
