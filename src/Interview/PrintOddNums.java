package Interview;

import java.util.ArrayList;

public class PrintOddNums {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        ArrayList myRevList = new ArrayList();
        for (int i = 0; i < 20; i++) {
            if (i%2 != 0) {
                myList.add(i);
            }
        }
        System.out.println(myList);
        for (int i = myList.size() - 1; i >=0 ; i-= 2) {
            myRevList.add(myList.get(i));
        }
        System.out.println(myRevList);
    }
}
