package string_codes;

public class CheckAnagramStrings {

    public static boolean isAnagram(String s1, String s2)
    {
        // if length is not equal they are not anagrams
        if(s1.length() != s2.length())
        {
            return false;
        }

        // if string is having any Unicode character
        int[] charCount = new int[256];

        for(int i=0; i<s1.length(); i++)
        {
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }

        for(int count : charCount)
        {
             if(count != 0)
             {
                 return false;
             }
        }

        return true;

    }

    public static void main(String[] args) {

        System.out.println(isAnagram("tea","eat")); // true
        System.out.println(isAnagram("bit","tib")); // true
        System.out.println(isAnagram("bye","hello")); // false
        System.out.println(isAnagram("listen","silent")); // true


    }
}
