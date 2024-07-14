package Interview;

public class CountOfCapitalAndSmall {
    public static void main(String[] args) {
        String str = "JavAProGraAM";
        int upper = 0, lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') { //ch[i] >= 65 and ch[i] <=90
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {//ch[i] >= 97 and ch[i] <=122
                lower++;
            }
        }
        System.out.println("Count of Upper Case : " +upper);
        System.out.println("Count of Lower Case : " +lower);
        // for number ch[i] >= 48 and ch[i] <=57
    }
}
