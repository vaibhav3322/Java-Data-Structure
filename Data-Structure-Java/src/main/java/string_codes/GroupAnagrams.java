package string_codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// time compexity O(n*k) & space complexity O(n*k)
public class GroupAnagrams {


    public static List<List<String>> groupingAnagrams(String[] str)
    {
        // map is used to store freq based keys and value as list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for(String s : str)
        {
            // for counting freq of english lowercase letters
            int[] freq = new int[26];

            // char array - for converting string to charcters
            char[] ch = s.toCharArray();

            // for calculating the freq of characters
            for(char c : ch)
            {
                freq[c - 'a']++;
            }

            // Build a unique key from frequency array
            // for ex - a1#b0#c1#d0...
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq)
            {
                keyBuilder.append(count).append('#');
            }

            // convert the keybuilder to String again
            String keys = keyBuilder.toString();

            // If key is not present then create a new Arraylist and add the string
            map.computeIfAbsent(keys, k -> new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> listList = groupingAnagrams(str);

        System.out.println(listList);
    }
}
