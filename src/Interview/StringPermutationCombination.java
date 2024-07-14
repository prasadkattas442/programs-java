package Interview;

public class StringPermutationCombination {

    static char[] ch;
    static int count = 1;

    public static void main(String[] args) {
       String str = "abc";
        for (int i = 0; i < str.length(); i++) {
            ch = str.toCharArray();
        }
        for (int a = 0; a < str.length(); a++) {
            System.out.println(count + " : " + ch[a]);
            count++;
            for (int b = 0; b < str.length(); b++) {
                if(! (ch[a] == ch[b])){
                    System.out.println(count + " : " + ch[a] + " " + ch[b]);
                    count++;
                }
                for (int c = 0; c < str.length(); c++) {
                    if(!(ch[b] == ch[c]) && !(ch[a] == ch[c]) && !(ch[a] == ch[b])) {
                        System.out.println(count + " : " + ch[a] + " " + ch[b] + " " + ch[c]);
                        count++;
                    }
                }
            }
        }
    }
}
