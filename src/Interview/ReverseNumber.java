package Interview;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12321, rev = 0;
        int temp = number;

        //reverse the number
        while (number != 0) {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
        System.out.println(rev);

        //palindrome
        if (temp == rev) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }
    }
}
