package data_structures.arrays;

import java.util.Arrays;

public class Basic {

    public static void main(String[] args) {

        // creation of arrays and declare its size
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 8;
        nums[2] = 5;
        nums[3] = 3;
        nums[4] = 9;

        // to see array size ->
        System.out.println("ARRAY LENGHTH -> "+nums.length);

        System.out.println(Arrays.toString(nums));

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("normal for loop");
        // normal for loop
        for(int i=0; i< nums.length; i++)
        {
            System.out.println(nums[i] + " ");
        }

        // advanced for loop
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("advanced for loop");
        for(int pri : nums)
        {
            System.out.println(pri+" ");
        }

        // change the value at index 4
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Arrays Before changing value -> "+Arrays.toString(nums));
        nums[4] = 100;
        System.out.println("Arrays After changing value at index 4 -> "+Arrays.toString(nums));

    }
}
