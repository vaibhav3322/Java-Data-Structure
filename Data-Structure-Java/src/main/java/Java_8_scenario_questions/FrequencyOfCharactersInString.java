package Java_8_scenario_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FrequencyOfCharactersInString {

    public static void main(String[] args) {

        String str = "aabbccddefgh";

        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));

        System.out.println("Frequency Of Characters in the string... - "+str);
        System.out.println(map);

    }
}
