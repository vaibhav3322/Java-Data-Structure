package data_structures.arrays.binary_search;

public class CeilingOfNumber {

    public static void main(String[] args) {
        // Here we will find target ele index value as output
        int[] nums = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};//total 12 index i.e 13 numbers
        //  s               m           t     e
        int target = 20;

        int ans = ceiling(nums, target);
        System.out.println(ans);
    }
    static int ceiling(int[] nums, int target)
    {
        // ceiling of number - smallest num which is greater or == target

        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > nums[mid])
            {
                start = mid + 1;
            }
            else if(target < nums[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return start;
    }
}
