package com.pratiksha.dsa;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,12,18,25,31};
        int target = 31;

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Target not found");
    }
}
