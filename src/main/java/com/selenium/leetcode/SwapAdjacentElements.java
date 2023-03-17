package com.selenium.leetcode;

import java.util.Arrays;

public class SwapAdjacentElements {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] outputArray = swapAdjacentElements(inputArray);
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Output array: " + Arrays.toString(outputArray));
    }

    public static int[] swapAdjacentElements(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }
}