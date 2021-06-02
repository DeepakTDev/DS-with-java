import java.util.*;

public class RansomNote {

    public static void main(String args[]) {
        if (canCopy("demo", "domossedk")) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }

        printFirstDuplicate("demoett");
    }
    
    public static int findComplement(int n) {
        int bitLen = (int)(Math.log(n)/Math.log(2)) + 1;

        int BitMask = (1 << bitLen) -1;

        return n ^ BitMask;
    }
    public static void printFirstDuplicate(String s)
    {
        int[] arr = new int[26];

        for (char ch: s.toCharArray()) {
            if (arr[ch - 'a'] > 0) {
                System.out.println(ch);
                return;
            }
            arr[ch-'a']++;
        }
    }
    public static boolean canCopy(String ransom, String para)
    {
        Map<Character, Integer> stringMap = new LinkedHashMap<>();
        int index = 0;
        if (ransom.length() > para.length()) {
            return false;
        }
        for(char ch: ransom.toCharArray()) {
            index= para.indexOf(ch, (null == stringMap.get(ch) ? 0 : stringMap.get(ch) ));

            if (index == -1) {
                return false;
            }

            stringMap.put(ch, index+1);
        }

        return true;
    }
}
