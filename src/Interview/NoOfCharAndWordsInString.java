package Interview;

public class NoOfCharAndWordsInString {
    public static void main(String[] args) {
        String a = "Java is a Programming language";
        //No of words in a string
        String[] myStr = a.split(" ");
        System.out.println("No of words in this string : " + myStr.length);

        //No of chars in a string
        char[] myChar = a.toCharArray();
        System.out.println("No of chars in this string : " + myChar.length);
    }
}
