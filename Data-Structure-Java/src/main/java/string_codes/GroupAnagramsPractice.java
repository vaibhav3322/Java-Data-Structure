package string_codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsPractice {

    public static void main(String[] args) {

        String[] str = {"cat","act","eat","tea","bat", "tab"};

        List<List<String>> result = returnAnagramsList(str);

        System.out.println(result);
    }

    public static List<List<String>> returnAnagramsList(String[] str)
    {
        // map will store frequency ofkey and value as list of anagram.
        Map<String, List<String>> map = new HashMap<>();

        for(String st : str)
        {
            // counting freq of 26 letters.
            int[] frequency = new int[26];

            char[] ch = st.toCharArray();

            for(char c : ch)
            {
                frequency[c - 'a']++;
            }

            StringBuilder stringBuilKey = new StringBuilder();
            for(int count : frequency)
            {
                stringBuilKey.append(count).append("#");
            }
            // we will convert this stringBuilKey to string

            String key = stringBuilKey.toString();

            map.computeIfAbsent(key,k -> new ArrayList<>()).add(st);

        }
        return new ArrayList<>(map.values());
    }
}
