package Interview;

public class FindMissingNumInArray {
    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,5,6,7,8};
        int totalSum = 0;
        int myArraySum= 0 ;
        int n = myArray.length + 1;
        totalSum = n * (n + 1) / 2;
        for (int value:myArray) {
            myArraySum = myArraySum + value;
        }
        System.out.println("Missing number : " +(totalSum-myArraySum));
    }
}
