package data_structures.arrays;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr1 = {0,9,3,5,8,1};
        // reverse the array -> output will be-> [1,8,5,3,9,0]
        reverseArr(arr1);

        System.out.println(Arrays.toString(arr1));

    }

    public static void reverseArr(int[] arr1)
    {
                 int start = arr1[0]; // 0 //9 //3
                 int end = arr1.length-1; //1 //8 //5
                 while(start < end)
                 {
                     swap(arr1, start, end);
                     start++;
                     end--;

                 }
                 // original arr -> {0,9,3,5,8,1}
                 //                  s         e    s     e            s e
                 // after each swap & reverse -> [1,9,3,5,8,0] // [1,8,3,5,9,0] // [1,8,5,3,9,0]

    }

    public static void swap(int[] arr1, int start, int end)
    {
        int temp = arr1[start];
        arr1[start] = arr1[end];
        arr1[end] = temp;
    }
}
