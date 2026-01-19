package data_structures.arrays;

public class FindMaxEleFromArray {

    public static void main(String[] args) {
        int[] elements = {1,3,23,8,18};
       // findMax(elements);

        System.out.println("Max Element from the arrays is -> "+findMax(elements));

        // 0th ind -> maxEle = 1, then ->  maxEle< ele[i] -> maxEle = ele[i];
    }

    public static int findMax(int[] elements)
    {
        int maxEle = elements[0];
        for(int i=0; i<elements.length; i++)
        {
            if (maxEle< elements[i])
            {
                maxEle = elements[i];
            }
        }
        return maxEle;
    }


}
