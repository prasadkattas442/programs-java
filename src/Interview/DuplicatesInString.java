package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInString {
    public static void main(String[] args) {
        String string = "Java is a program and is a java";
        String[] strArray = string.split(" ");

        //1.Using Hashmap
        Map<String, Integer> myMap = new HashMap<>();
        for (String str : strArray) {
            Integer count = myMap.get(str);
            if (count == null) {
                myMap.put(str, 1);
            } else {
                myMap.put(str, ++count);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = myMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate words in a string : " + entry.getKey());
            }
        }

        //2.Using Set
        Set<String> mySet = new HashSet<String>();
        for (String str:strArray) {
            if (mySet.add(str) == false) {
                System.out.println("Duplicate words in a string : " +str);
            }
        }
    }
}
