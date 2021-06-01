import java.util.*;

public class uniqueString {

    public static void main(String arsg[])
    {
        String s = new String("my nae");

        Set<Character> setobj = new HashSet<>();

        for (char ch:s.toCharArray()) {
            if (setobj.contains(ch)) {
                System.out.println("contains duplicate");
                return;
            } else {
                setobj.add(ch);
            }
        }

        System.out.println("contains unique");
    }
}
