package Interview;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        ArrayList<String> myRevList = new ArrayList();

        myList.add(0, "Thulasi");
        myList.add(1, "Ram");
        myList.add(2, "Balumuri");
        System.out.println("Before Reversing : ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }

        for (int j = myList.size() - 1; j >= 0; j--) {
            myRevList.add(myList.get(j));
        }
        System.out.println("\nAfter Reversing : ");
        for (int k = 0; k < myRevList.size(); k++) {
            System.out.print(myRevList.get(k) + " ");
        }

    }
}
