package Interview;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListToHashMap {
    public static void main(String[] args) {
        HashMap myHashMap = new HashMap();
        ArrayList<String> myList = new ArrayList();
        myList.add("Chennai");
        myList.add("Hyderabad");
        myList.add("Bangalore");
        myList.add("Pune");
        myList.add("Mumbai");
        myList.add("Kolkata");

        for (int i = 0; i <= myList.size() -1; i+=2) {
            myHashMap.put(myList.get(i), myList.get(i+1));
        }
//        for (String str:myList) {
//            myHashMap.put(str, str.length());
//        }

//        for (int i = 0; i < myList.size(); i++) {
//            myHashMap.put(myList.indexOf(myList.get(i)), myList.get(i));
//        }

        System.out.println(myHashMap);
    }
}
