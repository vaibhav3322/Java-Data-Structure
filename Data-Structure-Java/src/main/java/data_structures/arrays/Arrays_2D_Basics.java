package data_structures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2D_Basics {
    public static void main(String[] args) {



    /*
        1 2 3
        4 5 6
        7 8 9
     */


    /* 1.
    // how to represent above array or matrices into arrays
    // below first [] is for - rows and second [] is for - columns.so that's why it is 2D array.
    // intialization is compulsary for rows array i.e not mandatory for column array

     */

//        int[][] arr = new int[3][];

    /*2.
        structure of 2D arrays representation
    */
//        int[][] arr2D = {
//                {10, 20, 30}, // this is 0th index
//                {40, 50, 60}, // this is 1st index
//                {70, 80, 90}  // this is 2nd index
//        };

    /* 3.
      how to iterate the 2d arrays
      lets take input via cmd scanner
     */

        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3]; // 2d array with 3 rows & 3 columns
        //3.1 first for loop for taking input of 2D arrays
        for (int rows = 0; rows < arr1.length; rows++) {
            for(int col =0; col< arr1[rows].length; col++)
            {
                 arr1[rows][col] = sc.nextInt();
            }

        }

        // 3.2 this for loop is printing 2d array
        for(int rows=0; rows< arr1.length; rows++)
        {
             for(int col=0; col<arr1[rows].length; col++)
             {
                 System.out.print(arr1[rows][col] + " ");
             }
            System.out.println();
        }
       // 3.3 advanced for loop
        System.out.println("advanced for loop -> ");
        for(int[] enhancedLoop : arr1)
        {
            System.out.println(Arrays.toString(enhancedLoop));
        }

        System.out.println("+++++++++++++++++++++++++++++++");

        /*
        // 4. String array foreach print
         */
        String[] str = {"cat","act","bat","tab","mat"};
        for(String ele : str)
        {
            System.out.println(ele);
        }

        System.out.println("+++++++++++++++++++++++++++++++");


    }
}
