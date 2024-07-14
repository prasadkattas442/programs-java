package Interview;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //print the 2nd highest repeated character in a string
        String str = "welcome to java class";
        int highest = 0;
        char[] ch = str.toCharArray();
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        for (int i =0; i < ch.length; i++) {
            char c = ch[i];
            if (myMap.containsKey(c)) {
                myMap.put(c, myMap.get(c)+1);
                if (myMap.get(c)+1 > highest) {
                    highest = myMap.get(c);
                }
            } else {
                myMap.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = myMap.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() == highest-1 ) {
                System.out.println(entry.getKey() +":" +entry.getValue());
            }
        }
    }
}
