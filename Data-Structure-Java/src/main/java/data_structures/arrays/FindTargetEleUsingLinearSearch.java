package data_structures.arrays;

public class FindTargetEleUsingLinearSearch {
    public static void main(String[] args) {
         int[] arr = {10,20,30,40,50,60,70};
        System.out.println(findTarget(arr));
         // find target element 40
    }

    static int findTarget(int[] arr)
    {
        int target =0;
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] == 40) {
                target = arr[i];
            }

        }
        return target;
    }
}
