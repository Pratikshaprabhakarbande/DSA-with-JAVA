package com.pratiksha.dsa;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,25,7,40,18};
        System.out.println(linearSearch(arr,7));
        System.out.println(linearSearch(arr,100));

    }
    static int linearSearch(int[]arr,int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
