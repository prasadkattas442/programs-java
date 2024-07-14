package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintVowelValues {
    public static void main(String[] args) {
        String str = "welcome to java class";
        char[] ch = str.toCharArray();
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        for (int i =0; i < ch.length; i++) {
            char c = ch[i];
            if (c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c =='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                if (myMap.containsKey(c)) {
                    myMap.put(c, myMap.get(c)+1);
                } else {
                    myMap.put(c, 1);
                }
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = myMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.println(entry);
        }
    }
}
