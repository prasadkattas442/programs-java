package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Test1 {
    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        myMap.put('a',0);
        myMap.put('b',1);
        myMap.put('c',2);
        myMap.put('d',3);
        myMap.put('e',2);
        System.out.println(myMap);

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.addAll(myMap.values());
        System.out.println(myList);
        int newValue = ThreadLocalRandom.current().nextInt(20);
//        int newValue = 2;
        if (!(myList.contains(newValue))) {
            myMap.put('c', newValue);
            System.out.println(newValue + " is added to the existing map");
        } else {
            System.out.println(newValue + " is already present in map");
        }
        System.out.println(myMap);
    }
}
