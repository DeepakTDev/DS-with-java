import java.util.*;
public class FirstUnique {

    public static void main(String args[])
    {
        String s =  new String("lleetcode");

        /*int[] arr = new int[26];

        for(char ch: s.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (char ch:s.toCharArray()) {
            if (arr[ch-'a'] == 1) {
                System.out.println(s.indexOf(ch)+ " ");
                return;
            }
        }*/

        Map<Character, Integer> stringMap = new LinkedHashMap<>();

        for(char ch:s.toCharArray()) {
            if (stringMap.containsKey(ch)) {
                stringMap.put(ch, stringMap.get(ch) + 1);
            } else {
                stringMap.put(ch, 1);
            }
        }
        
        for(char ch:s.toCharArray()) {
            if (stringMap.get(ch) ==1) {
                System.out.println(s.indexOf(ch));
                return;
            }
        }
        System.out.println("noo");
    }
}
