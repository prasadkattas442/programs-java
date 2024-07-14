package Interview;

public class ConvertEachCharOfFirstWordToUppercase {
    public static void main(String[] args) {
        String str = "welcome to java class";
        String[] strArray = str.split(" ");
        String newString = "";
        for (String str1 : strArray) {
            char ch = str1.charAt(0);
            char a = Character.toUpperCase(ch);
            String b = str1.substring(1);
            newString = newString + a + b + " ";
        }
        System.out.println(newString);
    }
}
