package Interview;

import java.util.ArrayList;

public class AddElementsToArray {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList();

        myList.add(0, "Thulasi");
        myList.add(1, "Ram");
        myList.add(2, "Balumuri");

        System.out.println(myList);

        ArrayList<String> myList1 = new ArrayList();

        myList1.add("Thulasi");
        myList1.add( "Ram");
        myList1.add("Balumuri");
        System.out.println(myList1);
    }
}
