package Interview;

import java.util.ArrayList;

public class ReverseStringInArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        ArrayList<String> myRevList = new ArrayList();

        myList.add(0, "Thulasi");
        myList.add(1, "Ram");
        myList.add(2, "Balumuri");
        System.out.println("Before Reversing String : ");
        System.out.println(myList);

        for (String str:myList) {
            String rev = "";
            for (int i = str.length()-1; i >=0 ; i--) {
                rev = rev + str.charAt(i);
            }
            myRevList.add(rev);
//            System.out.print(rev + " ");
        }
        System.out.println("After Reversing String : ");
        System.out.println(myRevList);
    }
}
