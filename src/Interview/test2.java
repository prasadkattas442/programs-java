package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class test2 {
    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        myMap.put('a',0);
        myMap.put('b',1);
        myMap.put('c',2);
        myMap.put('d',3);
        myMap.put('e',2);
        System.out.println("Map : " +myMap);

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.addAll(myMap.values());
        System.out.println("Array list : " + myList);

        int newValue = 3;
        int value = myList.get(2);
        System.out.println("2nd value of map : " + value);

        if (!(value == newValue)) {
            myMap.put('c', newValue);
            System.out.println(newValue + " is added to the existing map");
        } else {
            System.out.println(newValue + " is already present in map");
        }
        System.out.println(myMap);
    }
}
