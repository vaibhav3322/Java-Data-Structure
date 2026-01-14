package data_structures.arrays;

public class FindMaxEleWithInRange {

    public static void main(String[] args) {
        int[] elements = {1, 3, 23, 8, 18};
        System.out.println(maxEleWithinRange(elements,1,3));
    }

    public static int maxEleWithinRange(int[] elements, int start, int end)
    {
        int maxEle = elements[start];

        for(int i=start; i<=end; i++)
        {
            if(maxEle< elements[i])
            {
                maxEle = elements[i];
            }
        }
        return maxEle;
    }
}

