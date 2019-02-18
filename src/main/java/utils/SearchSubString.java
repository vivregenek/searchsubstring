package utils;

import java.util.HashMap;

public class SearchSubString {

    public static String getLongestSubstringTwoDistinct(String s) {
        if (s.equals(""))
            return s;

        HashMap<Character, Integer> map = new HashMap<>();

        int currentLength = 0;
        int currentStartIndex = 0;
        int maxCurrentLength = 0;
        int maxCurrentStartIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.size() <= 2) {
                if (!map.containsKey(c)) {
                    map.put(c, i);
                    if (map.size() != 3)
                        currentLength ++;
                } else {
                    if ((map.keySet().toArray()[0].equals(c)) && map.size() == 2)
                        map.put(c, i);
                    currentLength ++;
                }
            }
            if (map.size() == 3) {
                map.values().remove(map.values().stream().mapToInt(Integer::intValue).min().getAsInt());
                if (currentLength > maxCurrentLength){
                    maxCurrentLength = currentLength;
                    maxCurrentStartIndex = currentStartIndex;
                }
                currentStartIndex = map.values().stream().mapToInt(Integer::intValue).min().getAsInt();
                currentLength = i - currentStartIndex + 1; }
        }
        currentStartIndex = map.values().stream().mapToInt(Integer::intValue).min().getAsInt();
        if (currentLength > maxCurrentLength){
            maxCurrentLength = currentLength;
            maxCurrentStartIndex = currentStartIndex;
        }
        return s.substring(maxCurrentStartIndex, maxCurrentStartIndex + maxCurrentLength);
    }
}
