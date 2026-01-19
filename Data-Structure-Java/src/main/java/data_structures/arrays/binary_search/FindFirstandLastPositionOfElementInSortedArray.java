package data_structures.arrays.binary_search;

import java.util.Arrays;

public class FindFirstandLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {5,7,7,7,8,8,10};
        int target = 7;
        FindFirstandLastPositionOfElementInSortedArray f1= new FindFirstandLastPositionOfElementInSortedArray();

        System.out.println(Arrays.toString(f1.searchInRange(arr, target)));
    }

    int[] searchInRange(int[] arr, int target)
    {
        int[] ans1 = {-1,-1};

        int startIndex = search(arr, target, true);
        int lastIndex = search(arr, target,false);
        ans1[0] = startIndex;
        ans1[1] = lastIndex;

        return ans1;
    }

    int search(int[] arr, int target, boolean findStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
            {
                end = mid - 1;
            } else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                // potential output
                ans = mid;
                if(findStartIndex)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }


}
