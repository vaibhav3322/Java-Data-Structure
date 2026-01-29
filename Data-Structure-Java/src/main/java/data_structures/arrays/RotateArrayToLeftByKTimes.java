package data_structures.arrays;

import java.util.Arrays;

public class RotateArrayToLeftByKTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        rotateLeftByKTimes(arr, 2);

        System.out.println(Arrays.toString(arr)); // [3,4,5,6,1,2]
    }

    public static void rotateLeftByKTimes(int[] arr, int k)
    {
        k = k % arr.length;
        if (k < 0)
        {
            k = k + arr.length-1;
        }

        swap(arr, 0, k-1);
        swap(arr, k, arr.length-1);
        swap(arr, 0, arr.length-1);

    }

    public static void swap(int[] arr, int start, int end)
    {
        while (start < end) {
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;

            start++;
            end--;
        }
    }

}
