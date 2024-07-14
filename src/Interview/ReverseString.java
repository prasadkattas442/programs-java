package Interview;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Madam";

        //Reverse a string
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        //check if string is palindrome or not
        if (rev.equals(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }
}
