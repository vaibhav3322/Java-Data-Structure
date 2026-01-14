package data_structures.arrays;

import java.util.Arrays;

public class SwapArraysIndex {

    public static void swap(int[] arr, int ind1, int ind2)
    {
        int tem = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tem;

    }

    public static void main(String[] args) {
        int[] ele = {10,6,7,9,3,4,0};
        swap(ele, 0, 6);

        System.out.println(Arrays.toString(ele));
    }
}
