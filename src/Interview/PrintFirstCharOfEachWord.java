package Interview;

public class PrintFirstCharOfEachWord {
    public static void main(String[] args) {
        String str = "Java Program Java Program";
        String[] myStr = str.split(" ");

        for (int i = 0; i < myStr.length; i++) {
            String s = myStr[i];
            System.out.print(s.charAt(0) + " ");
        }
    }
}
