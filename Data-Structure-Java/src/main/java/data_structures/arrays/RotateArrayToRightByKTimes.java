package data_structures.arrays;

import java.util.Arrays;

public class RotateArrayToRightByKTimes {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        System.out.println("Original Array -> " + arr);
        rotateArrayToRightByKTimes(arr, 2);

        System.out.println("Array After Right Rotate ----" );
        System.out.println(Arrays.toString(arr)); // [50,60,10,20,30,40]

    }

    public static void rotateArrayToRightByKTimes(int[] arr, int k)
    {
        k = k% arr.length;
        if(k< 0)
        {
            k = k + arr.length-1;
        }

        swap(arr, 0, arr.length-1);
        swap(arr, 0, k-1);
        swap(arr, k, arr.length-1);

    }

    public static void swap(int[] arr, int start, int end)
    {
        while (start< end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
