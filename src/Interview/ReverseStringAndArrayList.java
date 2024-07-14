package Interview;

import java.util.ArrayList;

public class ReverseStringAndArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        ArrayList<String> myRevList = new ArrayList();
        ArrayList<String> myRevArrayList = new ArrayList();

        myList.add(0, "Thulasi");
        myList.add(1, "Ram");
        myList.add(2, "Balumuri");
        System.out.println("Before Reversing String : " +myList);

        for (String str:myList) {
            String rev = "";
            for (int i = str.length()-1; i >=0 ; i--) {
                rev = rev + str.charAt(i);
            }
            myRevList.add(rev);
        }
        System.out.println("After Reversing String : " +myRevList);

        for (int j = myRevList.size() - 1; j >= 0; j--) {
            myRevArrayList.add(myRevList.get(j));
        }
        System.out.println("After Reversing String and Arrays : " +myRevArrayList);
    }
}
